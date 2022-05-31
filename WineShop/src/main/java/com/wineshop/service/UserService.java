package com.wineshop.service;

import java.util.List;

import com.wineshop.entity.Role;
import com.wineshop.entity.User;

public interface UserService {
	
	public User checkLogin(String username, String password);
	public boolean createUser(User user);
	public boolean changePassword(User user);
	public List<User> getAllUser(int start, int limit);
	public Long countRecord();
	public boolean insertUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(Long id);
	public List<Role> getAllRole();
	public boolean isExitUsername(String username);
}
