package com.newcourse.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newcourse.start.entity.User;
import com.newcourse.start.service.UserService;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/api")
	public String home() {

		return "Api Run Successfully on port number 9090";
	}

	@PostMapping("/add")
	public User save(@RequestBody User user) {

		return userService.saveUser(user);
	}

	@PutMapping("/update/{userId}")
	public User Update(@RequestBody User user, @PathVariable("userId") long id) {

		return userService.updateUser(user, id);
	}

	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable("userId") long id) {
		this.userService.deleteUser(id);
	}

	@GetMapping("/users")
	public List<User> getAll() {

		return userService.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") long id) {

		return userService.getUserById(id);
	}
}
