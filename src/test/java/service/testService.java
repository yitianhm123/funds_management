package service;


import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hm.funds.mapper.TBookMapper;
import com.hm.funds.mapper.TCapitalAccountMapper;
import com.hm.funds.mapper.TCapitalAccountStatementsMapper;
import com.hm.funds.pojo.*;
import com.hm.funds.util.GuidUtils;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.impl.util.ReflectUtil;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class testService {

    private static  final org.slf4j.Logger log = LoggerFactory.getLogger(testService.class);

//    @Qualifier("tFundsAccountMapper")
    @Autowired
    private TCapitalAccountMapper tFundsAccountMappers;

    @Autowired
    private TCapitalAccountStatementsMapper tCapitalAccountStatementsMapper;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;

   @Autowired
    private TBookMapper tBookMapper;

    @Test
    public void testAdd(){
        TCapitalAccount tFundsAccount = new TCapitalAccount();
        tFundsAccount.setComName("ust-global");
        tFundsAccount.setBillAccount(new BigDecimal(1.0));
        tFundsAccount.setCashAccount(new BigDecimal(1.0));
        tFundsAccount.setOrderCash(new BigDecimal(1.0));
        tFundsAccount.setComId("test");
        tFundsAccount.setComType("02");
        tFundsAccount.setDeleted(true);
        tFundsAccount.setCreateUserId("123");
        tFundsAccount.setId(UUID.randomUUID().toString().replace("-",""));
        tFundsAccount.setOrderBill(new BigDecimal(1.0));
        tFundsAccount.setRebateAccount(new BigDecimal(1.0));
        tFundsAccount.setUpdateUserId("123");
        tFundsAccount.setCreateTime(new Date());
        tFundsAccount.setUpdateTime(new Date());
        tFundsAccount.setUsableBill(new BigDecimal(1.0));
        tFundsAccount.setUsableCash(new BigDecimal(1.0));
//        tFundsAccountMappers.insert(tFundsAccount);
        TCapitalAccountStatements tCapitalAccountStatements = new TCapitalAccountStatements();
        tCapitalAccountStatements.setId(GuidUtils.getGuid());
        tCapitalAccountStatements.setComName(tFundsAccount.getComName());
        tCapitalAccountStatements.setUpdateUserId("updateId");
        tCapitalAccountStatements.setOperateType("01");//01入金  2支付
        tCapitalAccountStatements.setReleasedFunds(new BigDecimal(0));
        tCapitalAccountStatements.setOtherBill("123");
        tCapitalAccountStatements.setOrderNo("P123123123");
        tCapitalAccountStatements.setComId(tFundsAccount.getComId());
        tCapitalAccountStatements.setAccountType("01");//01 现金 02 票据 03红包
        tCapitalAccountStatements.setComType("01");//01客户 02供应商
        tCapitalAccountStatements.setCreateTime(new Date());
        tCapitalAccountStatements.setCreateUserId("admin");
        tCapitalAccountStatements.setFreezedFunds(new BigDecimal(1.0));
        tCapitalAccountStatements.setFundsTradeNo(GuidUtils.getGuid());
        tCapitalAccountStatements.setFundsAmount(new BigDecimal(1.0));
        tCapitalAccountStatements.setFundsType("01");//01自由款 02订单配款
        tCapitalAccountStatements.setFundstradeType("01");//01入金
        tCapitalAccountStatements.setDeleted(0);
        tCapitalAccountStatements.setIncome(new BigDecimal(1.0));
        tCapitalAccountStatements.setUpdateTime(new Date());
        tCapitalAccountStatements.setPayout(new BigDecimal(0));
        tCapitalAccountStatementsMapper.insert(tCapitalAccountStatements);

    }

    @Test
    public void addTradeRecord(){
        TCapitalAccountStatementsExample tCapitalAccountStatements = new TCapitalAccountStatementsExample();
//        tCapitalAccountStatements.setAccountType("01");
//        tCapitalAccountStatements.setComId("test");
//        tCapitalAccountStatements.setComName("UST_GLOBAL");
        TCapitalAccountStatementsExample.Criteria criteria = tCapitalAccountStatements.createCriteria();
        criteria.andComIdEqualTo("test");
        criteria.andComTypeEqualTo("01");
        criteria.andAccountTypeEqualTo("01");
        PageHelper.startPage(1, 10);
//        List<Country> list = countryMapper.selectAll();
//用PageInfo对结果进行包装
        List<TBookDto> ts= tBookMapper.selectByExample(new TBookExample());
        PageInfo page = new PageInfo(ts);

//       List<TCapitalAccountStatements> ts= tCapitalAccountStatementsMapper.selectByExample(tCapitalAccountStatements);
       log.info("resutl:{}",ts!=null?ts.size():"");
        System.out.println(ts.size());
        TBook book = new TBook();
         book.setBookName("互联网");
         book.setBookMark("123");
         book.setBookAuthor("周");
         book.setCreateTime(new Date());
//         book.setBookAuthor("123");
         tBookMapper.insert(book);
    }


    @Test
    public void monthtest() {

        InputStream inputStream = ReflectUtil.getResourceAsStream("db.properties");
        log.info(inputStream.toString());
        // 部署流程定义
        repositoryService.createDeployment().addClasspathResource("process.bpmn20.xml").deploy();
        // 启动流程实例
        String procId = runtimeService.startProcessInstanceByKey("process").getId();
        // 获得第一个任务
        List<Task> tasks = taskService.createTaskQuery().taskCandidateGroup("sales").list();
        if(CollectionUtils.isEmpty(tasks)){
            tasks = taskService.createTaskQuery().taskAssignee("kermit").list();
        }

        for (Task task : tasks) {
            System.out.println("Following task is available for sales group: " + task.getName());
            // 认领任务这里由foozie认领，因为fozzie是sales组的成员
            taskService.claim(task.getId(), "kermit");
        };
        // 查看fozzie现在是否能够获取到该任务
        tasks = taskService.createTaskQuery().taskAssignee("kermit").list();
        for (Task task : tasks) {
            System.out.println("Task for kermit: " + task.getName());
            // 执行(完成)任务
            Map<String,Object> map = new HashMap<>();
            map.put("result","1");
            taskService.complete(task.getId(),map);
        }

        // 现在fozzie的可执行任务数就为0了
        System.out.println("Number of tasks for kermit: "
                + taskService.createTaskQuery().taskAssignee("kermit").count());
        // 获得第二个任务
        tasks = taskService.createTaskQuery().taskCandidateGroup("management").list();
        for (Task task : tasks) {
            System.out.println("Following task is available for accountancy group:" + task.getName());
            // 认领任务这里由kermit认领，因为gonzo是management组的成员
            taskService.claim(task.getId(), "gonzo");
        }

        // 完成第二个任务结束流程
        for (Task task : tasks) {
            Map<String,Object> map = new HashMap<>();
            map.put("result","1");
            taskService.complete(task.getId());
        }

        // 核实流程是否结束,输出流程结束时间
        HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery()
                .processInstanceId(procId).singleResult();

        System.out.println(JSON.toJSONString(historicProcessInstance));

    }
}
