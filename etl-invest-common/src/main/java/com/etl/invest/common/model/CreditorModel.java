package com.etl.invest.common.model;

import com.etl.base.common.model.BaseModel;

/**
 * <b>author</b>: forvoyager@outlook.com
 * <b>time</b>: 2019-09-30 11:51:35 <br>
 * <b>description</b>: 债权信息 模型 <br>
 */
public class CreditorModel extends BaseModel {

  public static final String CREDITOR_ID = "creditor_id";
  public static final String PARENT_CREDITOR_ID = "parent_creditor_id";
  public static final String USER_ID = "user_id";
  public static final String BORROW_ID = "borrow_id";
  public static final String STATUS = "status";
  public static final String CAPITAL = "capital";
  public static final String INTEREST = "interest";
  public static final String PERIOD = "period";
  public static final String SURPLUS_PERIOD = "surplus_period";
  public static final String UNPAID_CAPITAL = "unpaid_capital";
  public static final String UNPAID_INTEREST = "unpaid_interest";
  public static final String START_TIME = "start_time";
  public static final String END_TIME = "end_time";
  public static final String PARTION = "partion";

  /**
   * 债权ID
   */
  private Long creditor_id;
  /**
   * 父债权ID
   */
  private Long parent_creditor_id;
  /**
   * 债权人
   */
  private Long user_id;
  /**
   * 标的id
   */
  private Long borrow_id;
  /**
   * 状态
   */
  private Integer status;
  /**
   * 本金（分）
   */
  private Long capital;
  /**
   * 利息（分）
   */
  private Long interest;
  /**
   * 总期数
   */
  private Integer period;
  /**
   * 剩余期数
   */
  private Integer surplus_period;
  /**
   * 待回收本金（分）
   */
  private Long unpaid_capital;
  /**
   * 待回收利息（分）
   */
  private Long unpaid_interest;
  /**
   * 债权开始日期
   */
  private Long start_time;
  /**
   * 债权结束日期
   */
  private Long end_time;
  /**
   * 持有份数
   */
  private Integer partion;

  public Long getCreditor_id() {
    return this.creditor_id;
  }
  public CreditorModel setCreditor_id(Long creditor_id) {
    this.creditor_id = creditor_id;
    return this;
  }

  public Long getParent_creditor_id() {
    return this.parent_creditor_id;
  }
  public CreditorModel setParent_creditor_id(Long parent_creditor_id) {
    this.parent_creditor_id = parent_creditor_id;
    return this;
  }

  public Long getUser_id() {
    return this.user_id;
  }
  public CreditorModel setUser_id(Long user_id) {
    this.user_id = user_id;
    return this;
  }

  public Long getBorrow_id() {
    return this.borrow_id;
  }
  public CreditorModel setBorrow_id(Long borrow_id) {
    this.borrow_id = borrow_id;
    return this;
  }

  public Integer getStatus() {
    return this.status;
  }
  public CreditorModel setStatus(Integer status) {
    this.status = status;
    return this;
  }

  public Long getCapital() {
    return this.capital;
  }
  public CreditorModel setCapital(Long capital) {
    this.capital = capital;
    return this;
  }

  public Long getInterest() {
    return this.interest;
  }
  public CreditorModel setInterest(Long interest) {
    this.interest = interest;
    return this;
  }

  public Integer getPeriod() {
    return this.period;
  }
  public CreditorModel setPeriod(Integer period) {
    this.period = period;
    return this;
  }

  public Integer getSurplus_period() {
    return this.surplus_period;
  }
  public CreditorModel setSurplus_period(Integer surplus_period) {
    this.surplus_period = surplus_period;
    return this;
  }

  public Long getUnpaid_capital() {
    return this.unpaid_capital;
  }
  public CreditorModel setUnpaid_capital(Long unpaid_capital) {
    this.unpaid_capital = unpaid_capital;
    return this;
  }

  public Long getUnpaid_interest() {
    return this.unpaid_interest;
  }
  public CreditorModel setUnpaid_interest(Long unpaid_interest) {
    this.unpaid_interest = unpaid_interest;
    return this;
  }

  public Long getStart_time() {
    return this.start_time;
  }
  public CreditorModel setStart_time(Long start_time) {
    this.start_time = start_time;
    return this;
  }

  public Long getEnd_time() {
    return this.end_time;
  }
  public CreditorModel setEnd_time(Long end_time) {
    this.end_time = end_time;
    return this;
  }

  public Integer getPartion() {
    return this.partion;
  }
  public CreditorModel setPartion(Integer partion) {
    this.partion = partion;
    return this;
  }

}

