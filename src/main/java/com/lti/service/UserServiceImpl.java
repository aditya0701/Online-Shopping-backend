package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.User;
import com.lti.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userrepo;
	
	@Override
	public Optional<User> findUserById1(int uid){
		return userrepo.findById(uid);
	}

	@Override
	public List<User> findAll() {
		return userrepo.findAll();
	}

	@Override
	public User Save(User user) {
		return userrepo.save(user);
	}

	@Override
	public User findUserById(int uid) {
		return null;
	}

	@Override
	public User UpdateUser(User user) {  //This is for Update User...
		return userrepo.save(user);
	}

	@Override
	public User fetchUserByEmailAndPassword(String uemail, String upassword) {
		return userrepo.findUserByEmailAndPassword(uemail, upassword);
	} 

}
