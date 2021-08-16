package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int prodid;
	@Column(name="product_name")
	private String prodName;
	@Column(name="unit_price")
	private int price;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="in_stock")
	private int inStock;
	@Column(name="brand")
	private String brand;
	
	private String url;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "addedProduct", cascade = CascadeType.ALL)
	private List<Cart> cart;

//	//bi-directional many-to-one association to OrderDetailTable
//	@OneToMany(mappedBy="productTable",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	private List<OrderDetailTable> orderDetailTables;

	//bi-directional many-to-one association to RetailerTable
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="supplier_id")
	private Supplier supplier;
	
	public List<Cart> getCart() {
		return cart;
	}
	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getInStock() {
		return inStock;
	}
	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Product() {
		super();
	}
//	public List<Image> getImage() {
//		return image;
//	}
//	public void setImage(List<Image> image) {
//		this.image = image;
//	}

	public void assignSupplier(Supplier supplier) {
		this.supplier=supplier;
		
	}
	public Product(int prodid, String prodName, int price, String category, String description, int inStock, String brand,
		String url, List<Cart> cart, Supplier supplier) {
	super();
	this.prodid = prodid;
	this.prodName = prodName;
	this.price = price;
	this.category = category;
	this.description = description;
	this.inStock = inStock;
	this.brand = brand;
	this.url = url;
	this.cart = cart;
	this.supplier = supplier;
}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
