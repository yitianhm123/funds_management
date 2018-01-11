package com.hm.funds.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.hm.funds.pojo.TCapitalAccount;
import com.hm.funds.pojo.TCapitalAccountStatements;
import com.hm.funds.pojo.TCapitalAccountStatementsExample;
import com.hm.funds.service.tFundsService;
import com.hm.funds.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("pages/account")
public class CustAccountController {
private static final Logger log = LoggerFactory.getLogger(CustAccountController.class);
    @Autowired
    private tFundsService tFundsService;

    @RequestMapping(value = "/queryCustAccount")
    @ResponseBody
    public Result getCustAccount(@RequestParam("comName") String custName,@RequestParam("pageSize") int pageSize,
                                 @RequestParam("pageNum") int pageNum){
        log.info("-========start=================custName:{}",custName);
        Result<List<TCapitalAccount>> result = new Result<List<TCapitalAccount>>();
       List<TCapitalAccount> tFundsAccounts =  tFundsService.queryCustAccount(custName);
       result.setList(tFundsAccounts);
        log.info("-=========================");
        return result;
    }

    @RequestMapping(value = "/getDetailAccountInforByComId",method = RequestMethod.POST)
    @ResponseBody
    public Result getDetailAccountInforByComId(@RequestParam("comId") String comId,
                                               @RequestParam("accountType") String accountType,
                                               @RequestParam("comType") String comType,
                                               @RequestParam("pageSize") int pageSize,
                                               @RequestParam("pageNum") int pageNum){

        log.info("===trade recode query======");
        Result<List<TCapitalAccountStatements>> result = new Result<List<TCapitalAccountStatements>>();
        TCapitalAccountStatementsExample example = new TCapitalAccountStatementsExample();
        TCapitalAccountStatementsExample.Criteria criteria = example.createCriteria();
        criteria.andAccountTypeEqualTo(accountType);
        criteria.andComIdEqualTo(comId);
        criteria.andComTypeEqualTo(comType);
        List<TCapitalAccountStatements> tFundsAccounts =  tFundsService.queryCustCapitalStatements(example);
        result.setList(tFundsAccounts);
        result.setNumber(tFundsAccounts.size());

        log.info("-========results================={}", result.getNumber());
        return result;
    }
}
