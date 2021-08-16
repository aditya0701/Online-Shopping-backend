package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Product;
import com.lti.model.Supplier;
import com.lti.model.User;
import com.lti.repository.SupplierRepository;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	SupplierRepository supplierRepository;
	
	@Override
	public Supplier findSupplierById(int supplier_id) {
		return supplierRepository.findById(supplier_id).get();
	}
	
	@Override
	public Supplier fetchSupplierByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return supplierRepository.findSupplierByEmailAndPassword(email, password);
	} 


	@Override
	public Supplier displaySupplierDetails(int supplierid) {
		// TODO Auto-generated method stub
		return supplierRepository.findById(supplierid).get();

	}
}
