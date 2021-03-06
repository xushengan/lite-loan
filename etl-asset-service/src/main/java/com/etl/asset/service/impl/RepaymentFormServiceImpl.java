package com.etl.asset.service.impl;

import com.etl.asset.common.service.IRepaymentFormService;
import com.etl.base.jdbc.service.impl.BaseServiceImpl;
import com.etl.asset.common.model.RepaymentFormModel;
import com.etl.asset.mapper.RepaymentFormMapper;
import org.springframework.stereotype.Service;

/**
 * <b>author</b>: forvoyager@outlook.com
 * <b>time</b>: 2019-09-30 09:30:12 <br>
 * <b>description</b>: 借款项目还款报表 服务实现 <br>
 */
@Service("repaymentFormService")
public class RepaymentFormServiceImpl extends BaseServiceImpl<RepaymentFormMapper, RepaymentFormModel> implements IRepaymentFormService {
  @Override
  protected String getPrimaryKeyName() {
    return "id";
  }
}
