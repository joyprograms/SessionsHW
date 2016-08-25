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
//    public ArrayList<User> messages = new ArrayList<User>();

    ArrayList messages = new ArrayList();

    //YEAH. NOT SUPER CONFIDENT IN MY ABILITY TO MAKE ARRAYS. I WILL CARVE TIME OUT SPECIFICALLY FOR THEM WHEN I STUDY.
    // want to add the text for the messages.
    //int index number for point on the array corresponding to number requested from user
    // String message for updated on the array.
    //I know it fits in the array in an index, but not sure how to write the actual array out.

    String messages [];
    messages = new String [0];
    messages [1] = "I wanted ice cream";
    messages [2] = "me too";


    or

    messages.add("I want water!");
    messages.add("super thirsty");
    messages.add(2);



    messages.add(User.message);


}
