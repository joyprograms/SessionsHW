package com.theironyard.charlotte;
import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {
    //creating a hashmap of users. i can add to the users later.
    // includes key and value.
//    static HashMap<String, User> users = new HashMap<>();
    static HashMap<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        Spark.init();
        // directing to path. need to create html
        //had to import spark libraries. done.
        //create html.
        //add code to html.
        // add code to get method.


        Spark.get(
                "/",
                ((request, response) -> {
                    Session session = request.session();// starts session
                    String name = session.attribute("username");  //stores login name in html
                    User user = users.get(name);//from hashmap
//

                    users.put("name", user);// puts name in the hashmap
                    return new ModelAndView(user, "home.html"); //saves info to display
                }),
                new MustacheTemplateEngine()
        );
        Spark.post(
                "/login",
                (((request, response) -> {
                    String name = request.queryParams("loginName");
                    User user = users.get(name);
                    Session session = request.session();
                    session.attribute("loginName", name);
                    response.redirect("/");

                    return "";
                })
                )
        );
        Spark.post(
                "/create-user",
                ((request, response) -> {
                    Session session = request.session();
                    String name = session.attribute("username");
                    User user = users.get(name);
                    String loginName = request.queryParams("loginName");
                    String password = request.queryParams("password");
                    User typist = new User (loginName, password);
                    user.getPasswords().add(typist);
                    return "";


                })
        );
        Spark.post(
                "/logout", // current session
                ((request, response) -> {
                    Session session = request.session();
                    session.invalidate(); //invalidates- delets user info
                    response.redirect("/");
                    return "";
                })
        );
        Spark.post(
                "/delete", // message
                ((request, response) -> {
                    Session session = request.session();

                    response.redirect("/");
                    return "";
                })
        );
    }
}

