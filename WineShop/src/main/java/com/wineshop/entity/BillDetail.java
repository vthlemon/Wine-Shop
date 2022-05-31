package com.wineshop.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill_detail")
public class BillDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int quantity = 0;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_bill")
	private Bill bill;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_product")
	private Product products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}

	public BillDetail() {
		super();
	}

	public BillDetail(int id, int quantity, Bill bill, Product products) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.bill = bill;
		this.products = products;
	}
}
