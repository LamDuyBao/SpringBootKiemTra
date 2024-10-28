package com.hcmute.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.hcmute.entity.Category;
import com.hcmute.repository.CategoryRepository;

@Service
public class CategorServiceImpl implements ICategoryService{
	@Autowired
	CategoryRepository categoryRepository;

	public CategorServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Optional<Category> findByName(String name) {
		return categoryRepository.findByName(name);
	}

	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return categoryRepository.findByNameContaining(name, pageable);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepository.save(entity);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> findById(Integer id) {
		return categoryRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return categoryRepository.existsById(id);
	}

	@Override
	public void deleteById(Integer id) {
		categoryRepository.deleteById(id);
	}


	
	
}
