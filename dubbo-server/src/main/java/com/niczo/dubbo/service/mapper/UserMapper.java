package com.niczo.dubbo.service.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.niczo.dubbo.service.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

	void insertSelective(User user);
}
