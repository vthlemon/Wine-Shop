package com.wineshop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotBlank (message = "Code không được bỏ trống!")
	private String code;

	@NotBlank (message = "Tên sản phẩm không được để trống!")
	private String name;

	@NumberFormat(pattern = "#,###,###,###")
	@Min(value=0, message ="Không đạt giá trị tối thiểu!")
	private double price;

	@Min(value=0, message ="Không đạt giá trị tối thiểu!")
	private int quantity;

	@Min(value=0, message ="Không đạt giá trị tối thiểu!")
	private double alcohol;

	@NotBlank (message = "Mô tả sản phẩm không được để trống!")
	private String description;

	@NotBlank (message = "Nguồn gốc không được để trống!")
	private String madein;

	@Column(name = "url_img")
	private String url;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "update_at")
	private Date updateAt;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_category")
	private Category category;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_status")
	private ProductStatus productstatus;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_supplier")
	private Supplier supplier;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ProductStatus getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(ProductStatus productstatus) {
		this.productstatus = productstatus;
	}

	public Product() {
		super();
	}

	public Product(int id, String code, String name, double price, int quantity, double alcohol, String description, String madein, String url, Date updateAt, Category category, ProductStatus productstatus, Supplier supplier) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.alcohol = alcohol;
		this.description = description;
		this.madein = madein;
		this.url = url;
		this.updateAt = updateAt;
		this.category = category;
		this.productstatus = productstatus;
		this.supplier = supplier;
	}
}
