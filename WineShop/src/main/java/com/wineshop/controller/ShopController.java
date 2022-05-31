package com.wineshop.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wineshop.entity.Category;
import com.wineshop.entity.Product;
import com.wineshop.service.CategoryService;
import com.wineshop.service.ProductService;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
@RequestMapping("/")
public class ShopController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("shop")
	public String shop(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		return "shop";
	}
	@RequestMapping(value = "/shopDetail/{id}", method = RequestMethod.GET)
	public String getProductByCategory(Model model, @PathVariable("id") int id) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		List<Product> listProductByCategory = productService.getProductByCategory(id);
		if (listProductByCategory != null) {
			model.addAttribute("listProductByCategory", listProductByCategory);
		}
		return "shopDetail";
	}
}
