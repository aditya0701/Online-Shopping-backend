package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userid;
	private String first_name;
	private String last_name;
	private String phone;
	private String email;
	private String password;
	private String address;
	
	
	public User(int userid, String first_name, String last_name, String phone, String email, String password,
			String address) {
		super();
		this.userid = userid;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.address = address;
	}


	public User() {
		super();
	}



	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
