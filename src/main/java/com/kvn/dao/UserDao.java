package com.kvn.dao;


import com.kvn.entity.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	User findByEmail(String email);

	void save(User user);
	
}

