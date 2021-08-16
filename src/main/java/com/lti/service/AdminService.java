package com.lti.service;

import com.lti.model.Admin;

public interface AdminService {
	public Admin fetchAdminByEmailAndPassword(String email, String password);
}
