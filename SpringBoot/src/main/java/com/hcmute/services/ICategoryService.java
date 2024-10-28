package com.hcmute.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hcmute.entity.Category;

public interface ICategoryService {

	void deleteById(Integer id);

	boolean existsById(Integer id);

	Optional<Category> findById(Integer id);

	List<Category> findAll();

	<S extends Category> S save(S entity);

	Page<Category> findByNameContaining(String name, Pageable pageable);

	Optional<Category> findByName(String name);

}
