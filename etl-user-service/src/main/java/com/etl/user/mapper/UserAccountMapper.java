package com.etl.user.mapper;

import com.etl.base.jdbc.mapper.IBaseMapper;
import com.etl.user.common.model.UserAccountModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * <b>author</b>: forvoyager@outlook.com
 * <b>time</b>: 2019-09-29 17:46:22 <br>
 * <b>description</b>: 用户账户 mapper操作 <br>
 */
@Mapper
public interface UserAccountMapper extends IBaseMapper<UserAccountModel> {
}
