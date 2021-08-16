package com.lti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lti.model.Product;
import com.lti.model.Supplier;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	public List<Product> findByCategory(String category);
	public List<Product> findByBrand(String brand);
	
	@Query("from Product p where p.prodid= ?1 OR p.prodid=?2 OR p.prodid= ?3 OR p.prodid=?4")
    public List<Product> findByIdCompare(int prodid1,int prodid2,int prodid3,int prodid4);
	
	@Query("Select p from Product p where p.price BETWEEN ?1 AND ?2") // <-
	public List<Product> findProductByPrice(int lower, int upper);
	
	public List<Product> findByProdName(String name);
	
	public List<Product> findBySupplierSupplierid(int supplier_id);
}
