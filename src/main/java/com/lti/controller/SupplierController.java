package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Supplier;
import com.lti.model.User;
import com.lti.service.SupplierService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/suppliercontroller")
public class SupplierController {
	@Autowired
	SupplierService supplierService;
	
	@PostMapping("/loginSupplier")
	public Supplier loginUser(@RequestBody Supplier user) throws Exception {
		
		String tempEmail = user.getEmail();
		String tempPass = user.getPassword();
		Supplier userobj = null;
		if(tempEmail != null && tempPass != null) {
			userobj = supplierService.fetchSupplierByEmailAndPassword(tempEmail, tempPass);
		}
		if (userobj == null) {
			throw new Exception("User does not Exist, Please Register first!");
		}
		return userobj;
		
	}

}
