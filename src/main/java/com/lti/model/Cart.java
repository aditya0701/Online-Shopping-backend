package com.lti.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int cart_id;

	private int quantity;

	//bi-directional many-to-one association to ProductTable
	@ManyToMany( cascade = CascadeType.ALL)
	@JoinTable(
			name="cart_product",
			joinColumns = @JoinColumn(name="cart_id"),
			inverseJoinColumns = @JoinColumn(name="product_id"))
	private List<Product> addedProduct;

	//bi-directional many-to-one association to UserTable
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	public Cart() {
		super();
	}


	public Cart(int cart_id, List<Product> addedProduct, User user, int quantity) {
		super();
		this.cart_id = cart_id;
		this.addedProduct = addedProduct;
		this.user = user;
		this.quantity = quantity;
	}


	public List<Product> getAddedProduct() {
		return addedProduct;
	}


	public void setAddedProduct(List<Product> addedProduct) {
		this.addedProduct = addedProduct;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	public void addToCart(Product product) {
		if (!addedProduct.contains(product))
		addedProduct.add(product);
		else {
			System.out.println("Product Already exists");
		}
	}


	public void deleteFromCart(Product product) {
		if (addedProduct.contains(product))
			addedProduct.remove(product);
			else {
				System.out.println("Product Does not exists");
			}
	}
	
}
