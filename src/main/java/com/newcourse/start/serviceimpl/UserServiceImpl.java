package com.newcourse.start.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newcourse.start.entity.User;
import com.newcourse.start.repository.UserRepository;
import com.newcourse.start.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user, long id) {
		
		User dbUser = userRepository.findById(id);
		dbUser.setName(user.getName());
		dbUser.setSalery(user.getSalery());
		 
		 System.out.println("dbUser"+ dbUser);
		 		return userRepository.save(dbUser);
	}

	@Override
	public void deleteUser(long id) {
		this.userRepository.deleteById(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		return userRepository.findById(id);
	}




}
