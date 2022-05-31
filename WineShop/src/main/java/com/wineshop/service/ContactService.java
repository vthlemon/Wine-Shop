package com.wineshop.service;

import java.security.PublicKey;
import java.util.List;

import com.wineshop.entity.Contact;
import com.wineshop.entity.Product;

public interface ContactService {
	public List<Contact> getAllContact();
	public Contact getContactById(int id);
	public boolean insertContact(Contact contact);

}
