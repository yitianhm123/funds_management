package com.hm.funds.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.hm.funds.mapper.TBookMapper;
import com.hm.funds.mapper.TCapitalAccountMapper;
import com.hm.funds.mapper.TCapitalAccountStatementsMapper;
import com.hm.funds.mapper.TReaderMapper;
import com.hm.funds.pojo.*;
import com.hm.funds.service.tFundsService;
import com.hm.funds.util.Result;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.task.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class tFundsServiceImpl implements tFundsService {

private static final Logger log = LoggerFactory.getLogger(tFundsServiceImpl.class);
    @Autowired
    private TCapitalAccountMapper tFundsAccountMapper;

    @Autowired
    private TReaderMapper readerMapper;

    @Autowired
    private TCapitalAccountStatementsMapper tCapitalAccountStatementsMapper;

    @Autowired
    private TBookMapper tBookMapper;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;


    public void addFundAccount(TCapitalAccount tFundsAccount){

        tFundsAccountMapper.insert(tFundsAccount);

    }

    public List<TCapitalAccount> queryCustAccount(String custName){
        TCapitalAccountExample tFundsAccountExample = new TCapitalAccountExample();
       com.hm.funds.pojo.TCapitalAccountExample.Criteria criteria =  tFundsAccountExample.createCriteria();
       if(StringUtil.isNotEmpty(custName)){
           Map<String,Object> map = new HashMap<>();
           map.get("123");
           List<String> ids = new ArrayList<String>();
           ids.add("");
           criteria.andComIdIn(ids);
        }
        List<TCapitalAccount> tFundsAccounts =  tFundsAccountMapper.selectByExample(tFundsAccountExample);
        log.info("queryAccount:{}",tFundsAccounts.size());
        return tFundsAccounts;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void saveBookMark(TBook book) {
        try {
            tBookMapper.insert(book);
        }catch(Exception e){
            log.info("error message,{}",e.getLocalizedMessage());
        }

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void updateReader(TReader reader) throws Exception {
        TReaderExample readerExample = new TReaderExample();

        readerExample.createCriteria().andIdEqualTo("");
//        readerMapper.updateByExample(reader,readerExample);
        throw new Exception("reader Exception here");
    }

    @Override
    public void deleteBookMark(TBook tbook) {
        try{
        tBookMapper.deleteByPrimaryKey(tbook.getId());
    }catch(Exception e){
        log.info("error message,{}",e.getLocalizedMessage());
    }
    }

    @Override
    public Result<List<TBookDto>> queryTbookAll() {
        Result<List<TBookDto>> result = new Result<>();

        TBookExample bookExample =  new TBookExample();
        PageHelper.startPage(1, 10);
//        List<Country> list = countryMapper.selectAll();
//用PageInfo对结果进行包装
//        List<TBookDto> ts= tBookMapper.selectByExample(new TBookExample());
//        PageInfo page = new PageInfo(ts);
        List<TBookDto> tBooks = tBookMapper.selectByExample(bookExample);
        PageInfo page = new PageInfo(tBooks);
        result.setList(page.getList());
        result.setNumber((int)page.getTotal());
        return result;
    }

    @Override
    public List<TCapitalAccountStatements> queryCustCapitalStatements(TCapitalAccountStatementsExample example) {
        List<TCapitalAccountStatements> tradeRecodes = tCapitalAccountStatementsMapper.selectByExample(example);
        return tradeRecodes;
    }


    public void doprocess(){
        // 部署流程定义
        repositoryService.createDeployment().addClasspathResource("./src/main/resources/myProcess.bpmn20.xml").deploy();
        // 启动流程实例
        String procId = runtimeService.startProcessInstanceByKey("financialReport").getId();
        // 获得第一个任务
        List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("sales").list();
        for (Task task : tasks) {
            System.out.println("Following task is available for sales group: " + task.getName());
            // 认领任务这里由foozie认领，因为fozzie是sales组的成员
            taskService.claim(task.getId(), "fozzie");
        }
        // 查看fozzie现在是否能够获取到该任务
        tasks = taskService.createTaskQuery().taskAssignee("fozzie").list();
        for (Task task : tasks) {
            System.out.println("Task for fozzie: " + task.getName());
            // 执行(完成)任务
            taskService.complete(task.getId());
        }

        // 现在fozzie的可执行任务数就为0了
        System.out.println("Number of tasks for fozzie: "
                + taskService.createTaskQuery().taskAssignee("fozzie").count());
        // 获得第二个任务
        tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
        for (Task task : tasks) {
            System.out.println("Following task is available for accountancy group:" + task.getName());
            // 认领任务这里由kermit认领，因为kermit是management组的成员
            taskService.claim(task.getId(), "kermit");
        }

        // 完成第二个任务结束流程
        for (Task task : tasks) {
            taskService.complete(task.getId());
        }

        // 核实流程是否结束,输出流程结束时间
        HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery()
                .processInstanceId(procId).singleResult();
        System.out.println("Process instance end time: " + historicProcessInstance.getEndTime());

    }


}
