package com.lti.service;

import java.util.List;

import com.lti.model.Cart;

public interface Cartservice {
	public Cart addToCart(int prodid,int cartId);
	public List<Cart> getAllCart();
	public Cart getCartById(int cartId);
	public Cart deleteFromCart(int prodid,int cartId);
	public Cart getCartByUserid(int userid);
//	public List<Cart> getAllItemsByUserId(int userId);
//	public List<Cart> getAllItemsByProductId(int prodid);

}
