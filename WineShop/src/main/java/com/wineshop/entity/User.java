package com.wineshop.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank (message = "Họ và tên không được để trống!")
	@Column(name = "displayName")
	private String displayName;

	@NotBlank (message = "Username không được để trống!")
	private String username;

	@NotBlank (message = "Email không được để trống!")
	@Email(message = "Vui lòng nhập đúng định dạng Email!")
	private String email;

	@NotBlank (message = "Số điện thoại không được để trống!")
	@Length (min = 10, message = "Số điện thoại không hợp lệ!")
	private String phone;

	@NotBlank (message = "Password không được để trống!")
	@Length(min = 8, message = "Độ dài mật khẩu không được nhỏ hơn 8")
	private String password;
	
	private boolean active = true;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", 
		joinColumns = { @JoinColumn(name = "id_user", referencedColumnName = "id") }, 
		inverseJoinColumns = { @JoinColumn(name = "id_role", referencedColumnName = "id")})
	private Role role;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private Collection<Bill> bills;
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public User() {
		super();
	}

	public User(Long id, String displayName, String username, String email, String phone, String password, boolean active, Role role, Collection<Bill> bills) {
		super();
		this.id = id;
		this.displayName = displayName;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.active = active;
		this.role = role;
		this.bills = bills;
	}
}
