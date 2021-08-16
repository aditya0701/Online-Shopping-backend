package com.lti.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Supplier")
public class Supplier {
	
	@Id
	@GeneratedValue
	@Column(name="supplier_id")
	private int supplierid;
	private String supplier_name;
	private String phone;
	private String email;
	private String password;
	
//	@JsonIgnore
//	@OneToMany(mappedBy = "supplier")
//	private Set<Product> products;

	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public Supplier(int supplierid, String supplier_name, String phone, String email, String password) {
		super();
		this.supplierid = supplierid;
		this.supplier_name = supplier_name;
		this.phone = phone;
		this.email = email;
		this.password = password;
//		this.products = products;
	}
	public Supplier() {
		super();
	}
//	public Set<Product> getProducts() {
//		return products;
//	}
//	public void setProducts(Set<Product> products) {
//		this.products = products;
//	}
	
	
}
