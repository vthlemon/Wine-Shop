package com.wineshop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	private int id;
	
	private String roleName;

	@OneToOne(mappedBy = "role")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role() {
		super();
	}

	public Role(int id, String roleName, User user) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.user = user;
	}
}
