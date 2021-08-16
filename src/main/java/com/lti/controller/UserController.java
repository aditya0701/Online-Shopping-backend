package com.lti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.User;
import com.lti.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/usercontroller")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getUserById/{uid}")
	public Optional<User> getUserById(@PathVariable(value = "uid") int uid) {
		return userService.findUserById1(uid);
	}
	
	
	@GetMapping("/findAll")
	public List<User> findAll()
	{
		return userService.findAll();
	}
	
	@PostMapping("/save")
	public User Save(@RequestBody User user)
	{
		return userService.Save(user);
	} 
	
	@PutMapping("/updateuser")  // For Updating User.....
	public User UpdateUser(@RequestBody User user)
	{
		return userService.UpdateUser(user);
	}
	
	@PostMapping("/loginUser")
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmail = user.getEmail();
		String tempPass = user.getPassword();
		User userobj = null;
		if(tempEmail != null && tempPass != null) {
			userobj = userService.fetchUserByEmailAndPassword(tempEmail, tempPass);
		}
		if (userobj == null) {
			throw new Exception("User does not Exist, Please Register first!");
		}
		return userobj;
		
	}
}
