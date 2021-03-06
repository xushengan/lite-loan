package com.etl;

import com.etl.base.common.util.JsonUtils;
import com.etl.asset.AssetServiceApplication;
import com.etl.asset.common.enums.RepaymentMode;
import com.etl.asset.common.model.BorrowModel;
import com.etl.asset.common.service.IBorrowBiz;
import com.etl.asset.common.service.IBorrowService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: forvoyager@outlook.com
 * @Time: 2019-09-30 11:57
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = AssetServiceApplication.class)
public class BorrowTest {
  
  @Resource
  private IBorrowService borrowService;

  @Resource
  private IBorrowBiz borrowBiz;

  @Test
  public void test_apply() throws Exception{
    // 申请借款
    BorrowModel borrowModel = new BorrowModel();
    borrowModel.setUser_id(1L);
    borrowModel.setTitle("借款测试_"+System.currentTimeMillis());
    borrowModel.setAmount(1000000L*100); // 分
    borrowModel.setPeriod(12);
    borrowModel.setApr(0.102);
    borrowModel.setRepayment_mode(RepaymentMode.AVERGE_INEREST.getCode());
    borrowModel = borrowService.apply(borrowModel);
    System.out.println(JsonUtils.parseJson(borrowModel));
  }

  @Test
  public void test_check() throws Exception{
    // 借款审核
    borrowService.check(4);
  }

  @Test
  public void test_release() throws Exception{
    // 发布标的
    borrowService.release(4);
  }

  @Test
  public void test_verify() throws Exception{
    // 满标终审
    borrowBiz.verify(4);
  }
}
