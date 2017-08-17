package com.hnuls.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hnuls.dao.UserMapper;
import com.hnuls.pojo.User;
import com.hnuls.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	//@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
