package com.lti.service;

import java.util.List;

import com.lti.model.Image;

public interface ImageService {
	public List<Image> getAllImageByPostId(int prodid);
}
