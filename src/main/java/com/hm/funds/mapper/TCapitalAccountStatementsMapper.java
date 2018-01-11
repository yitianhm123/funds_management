package com.hm.funds.mapper;

import com.hm.funds.pojo.TCapitalAccountStatements;
import com.hm.funds.pojo.TCapitalAccountStatementsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCapitalAccountStatementsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int countByExample(TCapitalAccountStatementsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int deleteByExample(TCapitalAccountStatementsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int insert(TCapitalAccountStatements record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int insertSelective(TCapitalAccountStatements record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    List<TCapitalAccountStatements> selectByExample(TCapitalAccountStatementsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    TCapitalAccountStatements selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int updateByExampleSelective(@Param("record") TCapitalAccountStatements record, @Param("example") TCapitalAccountStatementsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int updateByExample(@Param("record") TCapitalAccountStatements record, @Param("example") TCapitalAccountStatementsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int updateByPrimaryKeySelective(TCapitalAccountStatements record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_capital_account_statements
     *
     * @mbggenerated Fri Nov 17 17:04:13 CST 2017
     */
    int updateByPrimaryKey(TCapitalAccountStatements record);
}