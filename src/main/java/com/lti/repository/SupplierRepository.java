package com.lti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.model.Supplier;
import com.lti.model.User;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{
	public Supplier findSupplierByEmailAndPassword(String email, String password);
}
