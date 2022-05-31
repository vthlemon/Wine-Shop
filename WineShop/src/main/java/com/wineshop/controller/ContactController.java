package com.wineshop.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.wineshop.entity.Contact;
import com.wineshop.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wineshop.entity.Category;

import com.wineshop.service.CategoryService;

@Transactional
@Controller
public class ContactController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	ContactService contactService;

	@RequestMapping("contact")
	public String contact(ModelMap model) {
		List<Category> listCategory = categoryService.getAllCategory();
		model.addAttribute("listCategory", listCategory);
		model.addAttribute("contact", new Contact());
		return "contact";
	}

	@RequestMapping(value = "contact/insert", method = RequestMethod.POST)
	public String contact(ModelMap model, @ModelAttribute("contact") @Valid Contact contact, BindingResult result) {
		if (result.hasErrors()) {
			return "contact";
		} else {
			boolean check = contactService.insertContact(contact);
			if (check) {
				model.addAttribute("message", "Liên hệ thành công!");
			} else {
				model.addAttribute("message", "Liên hệ thất bại!");
			}
			model.addAttribute("contact", new Contact());
			return "contact";
		}
	}

	@RequestMapping(value = "/admin/contact", method = RequestMethod.GET)
	public String listContact(ModelMap model) {
		List<Contact> listContact = contactService.getAllContact();
		model.addAttribute("listContact", listContact);
		return "admin/mail_list";
	}
	@RequestMapping(value = "/admin/contact/detail/{id}", method = RequestMethod.GET)
	public String viewContact(ModelMap model, @PathVariable("id") int id) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "admin/mail_form";
	}
}
