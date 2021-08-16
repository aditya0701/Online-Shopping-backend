package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Product;
import com.lti.model.Supplier;
import com.lti.repository.ImageRepository;
import com.lti.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository prodRepo;

	
	@Override
	public Product findProduct(int prodid) {
		return prodRepo.findById(prodid).get();
	}


	@Override
	public List<Product> findProductByCategory(String category) {
		return prodRepo.findByCategory(category);
	}


	@Override
	public List<Product> compareProducts(int prodid1, int prodid2, int prodid3, int prodid4) {
		return prodRepo.findByIdCompare(prodid1,prodid2,prodid3,prodid4);
	}


	@Override
	public List<Product> findProductByName(String name) {
		return prodRepo.findByProdName(name);
	}
	
	@Override
	public List<Product> findProductByPrice(int lower, int upper) {
		return prodRepo.findProductByPrice(lower, upper);// <-
	}
	
	@Override
	public List<Product> getAllProduct() {
		return prodRepo.findAll();
	}


	@Override
	public List<Product> findProductByBrand(String brand) {
		return prodRepo.findByBrand(brand);
	}


	@Override
	public List<Product> getSupplier(int supplier_id) {
		return prodRepo.findBySupplierSupplierid(supplier_id);
	}
}
