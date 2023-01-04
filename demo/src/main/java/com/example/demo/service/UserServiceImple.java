package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDao;
import com.example.demo.model.Users;

@Service
public class UserServiceImple implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Users> getUserInfo() {
		// TODO Auto-generated method stub
		return userDao.getUserInfo();
	}
	
	

}
