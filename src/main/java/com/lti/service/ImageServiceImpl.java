package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lti.model.Image;
import com.lti.repository.ImageRepository;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {

	@Autowired
	ImageRepository imageRepository;
	
	@Override
	public List<Image> getAllImageByPostId(int prodid) {
		return imageRepository.findByProductProdid(prodid);
	}

}
