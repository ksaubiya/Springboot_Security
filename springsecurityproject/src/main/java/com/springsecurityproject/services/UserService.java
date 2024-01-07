package com.springsecurityproject.services;

import com.springsecurityproject.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> list=new ArrayList<>();

    public UserService()
    {
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","abcxyz","xyz@gmail.com"));
    }

    //get all users

    public List<User> getAllUsers() {
        return this.list;
    }

    //get single user
    public User getUser(String username)
    {
        return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
    }

    //
    public User addUser(User user)
    {
        this.list.add(user);
        return user;
    }
}
