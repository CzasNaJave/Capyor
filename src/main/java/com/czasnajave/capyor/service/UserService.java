package com.czasnajave.capyor.service;

import com.czasnajave.capyor.beans.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();

    public User getUserById(Long id);

    public void updateUser(User user);

    public void save(User user);

}
