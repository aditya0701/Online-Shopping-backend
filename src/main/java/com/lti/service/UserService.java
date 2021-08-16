package com.lti.service;

import java.util.List;
import java.util.Optional;

import com.lti.model.User;

public interface UserService {
	public User findUserById(int uid); 
	
	public Optional<User> findUserById1(int uid);
	
	public List<User> findAll();
	
	public User Save(User user); 
	
	public User UpdateUser(User user);   // For Updating User....

	public User fetchUserByEmailAndPassword(String uemail, String upassword); // for login vala part
}
