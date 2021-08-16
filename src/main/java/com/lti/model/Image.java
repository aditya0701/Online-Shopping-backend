package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productimage")
public class Image {
	
	@Id
	@Column(name="image_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String imgid;
	private String img;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	public Image(String imgid, String img, Product product) {
		super();
		this.imgid = imgid;
		this.img = img;
		this.product = product;
	}

	public Image() {
		super();
	}
	
	public String getImgid() {
		return imgid;
	}

	public void setImgid(String imgid) {
		this.imgid = imgid;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
}
