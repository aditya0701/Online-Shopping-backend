package com.lti.service;

import java.util.List;

import com.lti.model.Product;
import com.lti.model.Supplier;

public interface ProductService {
	public Product findProduct(int prodid);
	public List<Product> findProductByCategory(String category);
	public List<Product> compareProducts(int prodid1,int prodid2,int prodid3,int prodid4);
	public List<Product> findProductByName(String name);
	public List<Product> findProductByBrand(String brand);
	public List<Product> getAllProduct();
	public List<Product> findProductByPrice(int lower, int upper);
	
	public List<Product> getSupplier(int supplier_id);
}
