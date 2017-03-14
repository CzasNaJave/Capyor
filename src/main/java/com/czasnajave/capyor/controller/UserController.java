package com.czasnajave.capyor.controller;

import com.czasnajave.capyor.beans.User;
import com.czasnajave.capyor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userslist.json")
    public @ResponseBody List<User> getUserList() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody void addUser(@RequestBody User user) {
        userService.save(user);}

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public @ResponseBody void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }


    @RequestMapping("/layout")
    public String getUserPartialPage(ModelMap modelMap) {
        return "users/layout";
    }
}
