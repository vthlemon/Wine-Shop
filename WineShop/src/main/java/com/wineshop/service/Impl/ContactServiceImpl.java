package com.wineshop.service.Impl;

import java.util.List;

import com.wineshop.entity.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wineshop.entity.Contact;
import com.wineshop.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	SessionFactory factory;
	
	@Override
	public List<Contact> getAllContact() {
		Session session = factory.openSession();
		try {
			String hql = "FROM Contact";
			Query query = session.createQuery(hql);
			List<Contact> result = query.list();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Contact getContactById(int id) {
		Session session = factory.getCurrentSession();
		try{
			String hql= "FROM Contact c WHERE c.id= :id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			Contact result = (Contact) query.uniqueResult();
			if (result != null) {
				return result;
			}
		} catch (Exception e) {
			System.out.println("Lỗi: " + e);
		}
		return null;
	}

	@Override
	public boolean insertContact(Contact contact) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(contact);
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
		} finally {
			session.close();
		}
		return false;
	}
}
