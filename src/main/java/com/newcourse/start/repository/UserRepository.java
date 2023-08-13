package com.newcourse.start.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newcourse.start.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {


	public User findById(long id);
	
//	public Optional<User> findByserId(long id);
	
}
