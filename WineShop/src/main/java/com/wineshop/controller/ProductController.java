package com.wineshop.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wineshop.entity.Category;
import com.wineshop.entity.Product;
import com.wineshop.service.CategoryService;
import com.wineshop.service.ProductService;

@Controller
@Transactional
public class ProductController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;

	@RequestMapping("/product")
	public String listProductHandler(ModelMap model, Integer offset, Integer maxResults) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		List<Product> list = productService.getAllProduct(offset, maxResults);
		model.addAttribute("listProduct", list);
		model.addAttribute("count", productService.countTotalRecords());
		model.addAttribute("offset", offset);
		List<Product> listNewProduct = productService.getNewProduct();
		model.addAttribute("listNewProduct", listNewProduct);
		return "product";
	}

	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String getDetailProduct(Model model, @PathVariable("id") int id) {
		List <Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		Product product = productService.getProductById(id);
		if (product != null) {
			model.addAttribute("productDetail", product);
		}
		return "detail";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String product_form(ModelMap model) {
		model.addAttribute("product", new Product());
		return "admin/product_form";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String product_form(ModelMap model, @ModelAttribute("product") Product product) {
		boolean check = productService.insertProduct(product);
		if (check) {
			model.addAttribute("message", "Thêm mới sản phẩm thành công!");
		} else {
			model.addAttribute("message", "Thêm mới sản phẩm thất bại!");
		}
		return "admin/product_form";
	}

}
