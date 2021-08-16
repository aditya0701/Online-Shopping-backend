package com.lti.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Admin;
import com.lti.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminrepo;

	@Override
	public Admin fetchAdminByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return adminrepo.findAdminByEmailAndPassword(email, password);
	}

}
