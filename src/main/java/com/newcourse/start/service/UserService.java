package com.newcourse.start.service;

import java.util.List;
import java.util.Optional;

import com.newcourse.start.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public User updateUser(User user,long id);
	
	public void deleteUser(long id);
	
	public List<User> getAllUsers();
	
	public User getUserById(long id) ;
}
