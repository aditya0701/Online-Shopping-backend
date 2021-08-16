package com.lti.service;

import com.lti.model.Supplier;
import com.lti.model.User;

public interface SupplierService {
	public Supplier findSupplierById(int supplier_id);

	Supplier fetchSupplierByEmailAndPassword(String email, String password);

	Supplier displaySupplierDetails(int supplierid);
}
