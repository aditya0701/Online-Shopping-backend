package com.lti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.model.Cart;
import com.lti.model.User;

public interface CartRepository extends JpaRepository<Cart,Integer> {
	public Cart findByUserUserid(int userid);
}
