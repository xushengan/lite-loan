package com.etl.asset.common.model;

import com.etl.base.common.model.BaseModel;

/**
 * <b>author</b>: forvoyager@outlook.com
 * <b>time</b>: 2019-09-30 09:30:12 <br>
 * <b>description</b>: 借款项目 模型 <br>
 */
public class BorrowModel extends BaseModel {

  public static final String BORROW_ID = "borrow_id";
  public static final String USER_ID = "user_id";
  public static final String TITLE = "title";
  public static final String STATUS = "status";
  public static final String AMOUNT = "amount";
  public static final String AVAILABLE_AMOUNT = "available_amount";
  public static final String PERIOD = "period";
  public static final String APR = "apr";
  public static final String PARTITION_AMOUNT = "partition_amount";
  public static final String REPAYMENT_MODE = "repayment_mode";
  public static final String INVEST_START_TIME = "invest_start_time";
  public static final String INVEST_END_TIME = "invest_end_time";

  /**
   * 标的id
   */
  private Long borrow_id;
  /**
   * 借款人id
   */
  private Long user_id;
  /**
   * 标题
   */
  private String title;
  /**
   * 状态
   */
  private Integer status;
  /**
   * 借款金额（分）
   */
  private Long amount;
  /**
   * 剩余可投金额（分）
   */
  private Long available_amount;
  /**
   * 借款期数
   */
  private Integer period;
  /**
   * 利率，如10.2% 存0.102
   */
  private Double apr;
  /**
   * 每份金额（分）
   */
  private Integer partition_amount;
  /**
   * 还款方式
   */
  private Integer repayment_mode;
  /**
   * 投标开始时间（秒）
   */
  private Long invest_start_time;
  /**
   * 投标结束时间（秒）
   */
  private Long invest_end_time;

  public Long getBorrow_id() {
    return this.borrow_id;
  }
  public BorrowModel setBorrow_id(Long borrow_id) {
    this.borrow_id = borrow_id;
    return this;
  }

  public Long getUser_id() {
    return this.user_id;
  }
  public BorrowModel setUser_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }

  public String getTitle() {
    return this.title;
  }
  public BorrowModel setTitle(String title) {
    this.title = title;
    return this;
  }

  public Integer getStatus() {
    return this.status;
  }
  public BorrowModel setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public Long getAmount() {
    return this.amount;
  }
  public BorrowModel setAmount(Long amount) {
    this.amount = amount;
    return this;
  }

  public Long getAvailable_amount() {
    return this.available_amount;
  }
  public BorrowModel setAvailable_amount(Long available_amount) {
    this.available_amount = available_amount;
    return this;
  }

  public Integer getPeriod() {
    return this.period;
  }
  public BorrowModel setPeriod(Integer period) {
    this.period = period;
    return this;
  }

  public Double getApr() {
    return this.apr;
  }
  public BorrowModel setApr(Double apr) {
    this.apr = apr;
    return this;
  }

  public Integer getPartition_amount() {
    return this.partition_amount;
  }
  public BorrowModel setPartition_amount(Integer partition_amount) {
    this.partition_amount = partition_amount;
    return this;
  }

  public Integer getRepayment_mode() {
    return this.repayment_mode;
  }
  public BorrowModel setRepayment_mode(Integer repayment_mode) {
    this.repayment_mode = repayment_mode;
    return this;
  }

  public Long getInvest_start_time() {
    return this.invest_start_time;
  }
  public BorrowModel setInvest_start_time(Long invest_start_time) {
    this.invest_start_time = invest_start_time;
    return this;
  }

  public Long getInvest_end_time() {
    return this.invest_end_time;
  }
  public BorrowModel setInvest_end_time(Long invest_end_time) {
    this.invest_end_time = invest_end_time;
    return this;
  }

}

