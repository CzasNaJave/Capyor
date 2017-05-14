package com.capyor.service;

import com.capyor.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
