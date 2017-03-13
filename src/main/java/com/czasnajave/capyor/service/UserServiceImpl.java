package com.czasnajave.capyor.service;

import com.czasnajave.capyor.beans.User;
import com.czasnajave.capyor.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Exilion
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private static List<User> userList = new ArrayList<User>();
    private static Long id = 0L;

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public User getUserById(Long id) {
        return findUserById(id);
    }

    @Override
    public void save(User user)
    {

        HibernateUtil hibernateUtil = new HibernateUtil();
        SessionFactory sessFact = hibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        org.hibernate.Transaction tr = session.beginTransaction();

        System.out.println(user.getUsername());


        session.save(user);
        session.getTransaction().commit();

        tr.commit();
    }


    @Override
    public void addUser(User user) {
        user.setId(++id);
        userList.add(user);

    }

    @Override
    public void updateUser(User user) {
        User foundUser = findUserById(user.getId());
        if (foundUser != null) {
            userList.remove(foundUser);
            userList.add(user);
        }
    }

    private User findUserById(Long id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }
}
