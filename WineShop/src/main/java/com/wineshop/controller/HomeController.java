package com.wineshop.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.common.reflection.XMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wineshop.entity.Category;
import com.wineshop.entity.Product;
import com.wineshop.service.CategoryService;
import com.wineshop.service.ProductService;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
@RequestMapping("/")
public class HomeController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;

	@RequestMapping("/index")
	public String index(ModelMap model) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "index";
	}

	@RequestMapping("error")
	public String error404(ModelMap model) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "404";
	}

	@RequestMapping("thank-you")
	public String thank(ModelMap model) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "thank-you";
	}

	@RequestMapping("success")
	public String success(ModelMap model) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "success";
	}
}
