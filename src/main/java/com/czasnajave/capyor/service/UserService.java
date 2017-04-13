package com.czasnajave.capyor.service;

import com.czasnajave.capyor.beans.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();

    public void addUser(User user);

    public void updateUser(User user);


}
