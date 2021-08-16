package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Cart;
import com.lti.model.Image;
import com.lti.model.Product;
import com.lti.model.Supplier;
import com.lti.service.Cartservice;
import com.lti.service.ImageService;
import com.lti.service.ProductService;
import com.lti.service.SupplierService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/product/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ImageService imageService;
	
	@Autowired
	Cartservice cartservice;
	
	@Autowired
	SupplierService supplierService;
	
	@GetMapping("/products/{prodid}")
	public Product getProductById(@PathVariable(value = "prodid") int prodid) {
		return productService.findProduct(prodid);
	}
	
	@GetMapping("/products/supplier/{supplier_id}")
	public List<Product> getProductBySupplierId(@PathVariable(value = "supplier_id") int supplier_id) {
		return productService.getSupplier(supplier_id);
	}
	@GetMapping("/supplier/{supplier_id}")
	public Supplier getSuplierById(@PathVariable(value = "supplier_id") int supplier_id) {
		return supplierService.findSupplierById(supplier_id);
	}
	
	@GetMapping("/products/all")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@GetMapping("/productsbycategory/{category}")
	public List<Product> getProductByCategory(@PathVariable(value = "category") String category) {
		return productService.findProductByCategory(category);
	}
	
	@GetMapping("/productsbybrand/{brand}")
	public List<Product> getProductByBrand(@PathVariable(value = "brand") String brand) {
		return productService.findProductByBrand(brand);
	}
	
	@GetMapping("/products/{prodid1}/{prodid2}/{prodid3}/{prodid4}")
	public List<Product> getProductById(@PathVariable(value="prodid1") int prodid1,@PathVariable(value="prodid2") int prodid2,@PathVariable(value="prodid3") int prodid3,@PathVariable(value="prodid4") int prodid4){
		return productService.compareProducts(prodid1,prodid2,prodid3,prodid4);
		
	}
	
	@GetMapping("/productsbyname/{name}")
	public List<Product> findByName(@PathVariable (value= "name") String name) {
		System.out.println(name);
		return this.productService.findProductByName(name);
	}
	
	@GetMapping("/products/images/{prodid}")
	public List<Image> getAllImagesByProductId(@PathVariable (value = "prodid") int prodid){
		return imageService.getAllImageByPostId(prodid);
	}
	
	@PutMapping("/{prodid}/cart/{cartId}")
	public Cart addToCart(
			@PathVariable (value = "prodid") int prodid,
			@PathVariable (value = "cartId") int cartId) {
		return cartservice.addToCart(prodid, cartId);
	}
	
	@PutMapping("/{prodid}/deleteFromCart/{cartId}")
	public Cart deleteFromCart(
			@PathVariable (value = "prodid") int prodid,
			@PathVariable (value = "cartId") int cartId) {
		return cartservice.deleteFromCart(prodid, cartId);
	}
	
	@GetMapping("/cart/all")
	public List<Cart> getAllCarts(){
		return cartservice.getAllCart();
	}
	
	@GetMapping("/cart/{cartId}")
	public Cart getCart(@PathVariable (value = "cartId") int cartId){
		return cartservice.getCartById(cartId);
	}
	
	@GetMapping("/cartbyuser/{userId}")
	public Cart getCartByUserid(@PathVariable (value = "userId") int userid){
		return cartservice.getCartByUserid(userid);
	}
	
	@GetMapping("/findProductByPrice/{lower}/{upper}") // <- gives correct output
	public List<Product> findProductByPrice(@PathVariable String lower, @PathVariable String upper) {
		System.out.println(lower+" "+upper);
		return productService.findProductByPrice(Integer.parseInt(lower), Integer.parseInt(upper));
	}
}
