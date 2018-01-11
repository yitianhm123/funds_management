package com.hm.funds.service;


import com.hm.funds.pojo.*;
import com.hm.funds.util.Result;

import java.awt.print.Book;
import java.util.List;

public interface tFundsService {

    void addFundAccount(TCapitalAccount tFundsAccount);

    List<TCapitalAccount> queryCustAccount(String custName);

    void saveBookMark(TBook book);

    void updateReader(TReader reader) throws Exception;

    void deleteBookMark(TBook tbook);

    Result<List<TBookDto>> queryTbookAll();

    List<TCapitalAccountStatements> queryCustCapitalStatements(TCapitalAccountStatementsExample custName);
//    List<Tf>
}
