package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findUserByEmailAndPassword(String email, String password);
}
