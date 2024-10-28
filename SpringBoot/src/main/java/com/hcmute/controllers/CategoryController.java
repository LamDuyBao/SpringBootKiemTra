package com.hcmute.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcmute.entity.Category;
import com.hcmute.services.ICategoryService;

@Controller
@RequestMapping("admin/category")
public class CategoryController {
	@Autowired
	ICategoryService categoryService;

	@GetMapping("/list")
	public String all(Model model) {
		List<Category> list = categoryService.findAll();
		model.addAttribute("list", list);
		return "admin/category/list";

	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("category", new Category());
		return "admin/category/add";
	}

	@GetMapping("/edit")
	public String update(Model model, @ModelAttribute("id") Integer id) {
		model.addAttribute("category", categoryService.findById(id).get());
		return "admin/category/edit";
	}
	@PostMapping("/save")
	public String save(Model model, @ModelAttribute("category") Category catemodel) {
		Category category = new Category();
		BeanUtils.copyProperties(catemodel, category);
		categoryService.save(category);
		return all(model);
	}
	@GetMapping("/delete")
	public String delete(Model model, @ModelAttribute("id") Integer id) {
		categoryService.deleteById(id);
		return all(model);
	}
}
