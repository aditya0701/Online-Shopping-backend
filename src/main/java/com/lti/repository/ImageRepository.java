package com.lti.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.model.Image;

public interface ImageRepository extends JpaRepository<Image, String>{
	List<Image> findByProductProdid(int prodid);
}
