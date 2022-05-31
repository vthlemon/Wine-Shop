package com.wineshop.service;

import java.util.HashMap;

import com.wineshop.dto.Cart;
import com.wineshop.entity.User;

public interface ShoppingCartService {

	public boolean paying(HashMap<Integer, Cart> cartItem, User user, double total);
}
