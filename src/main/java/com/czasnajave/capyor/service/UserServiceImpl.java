package com.czasnajave.capyor.service;

import com.czasnajave.capyor.beans.User;
import com.czasnajave.capyor.config.Dao;
import com.czasnajave.capyor.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("userService")
public class UserServiceImpl extends Dao implements UserService {
    private static List<User> userList = new ArrayList<User>();
    private static Long id = 0L;

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public void addUser(User user)
    {

        save(user);
        userList.add(user);
        System.out.println("User: " + user.getUsername() + " successful registred" );

    }


    @Override
    public void updateUser(User user) {
//        User foundUser = findUserById(user.getId());
//        if (foundUser != null) {
//            userList.remove(foundUser);
//            userList.add(user);
//        }
    }

    private User findUserById(Long id) {
//        for (User user : userList) {
//            if (user.getId() == id) {
//                return user;
//            }
//        }

        return null;
    }
}
