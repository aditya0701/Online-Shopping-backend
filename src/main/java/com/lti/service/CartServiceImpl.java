package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Cart;
import com.lti.model.Product;
import com.lti.repository.CartRepository;
import com.lti.repository.ProductRepository;

@Service
@Transactional
public class CartServiceImpl implements Cartservice {

	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Cart addToCart(int prodid,int cartId) {
		Cart cart = cartRepository.findById(cartId).get();
		Product product = productRepository.findById(prodid).get();
		cart.addToCart(product);
		return cartRepository.save(cart);
	}
	
	@Override
	public List<Cart> getAllCart() {
		return cartRepository.findAll();
	}

	@Override
	public Cart getCartById(int cartId) {
		return cartRepository.findById(cartId).get();
	}

	@Override
	public Cart deleteFromCart(int prodid, int cartId) {
		Cart cart = cartRepository.findById(cartId).get();
		Product product = productRepository.findById(prodid).get();
		cart.deleteFromCart(product);
		return cartRepository.save(cart);
	}

	@Override
	public Cart getCartByUserid(int userid) {
		return cartRepository.findByUserUserid(userid);
	}
	
}
