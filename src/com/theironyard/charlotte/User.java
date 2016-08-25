package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by meekinsworks on 8/24/16.
 */
public class User {
    String name;
    String password;
    String message;
    private ArrayList < User> passwords = new ArrayList<>();

    public ArrayList<User> getPasswords() {
        return passwords;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;

    }
    public ArrayList<User> messages = new ArrayList<User>();

    messages.add(User.message);


}
