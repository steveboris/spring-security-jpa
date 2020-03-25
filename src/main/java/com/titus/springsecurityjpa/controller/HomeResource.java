package com.titus.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    // Accessible for everybody
    @GetMapping({"/home"})
    public String home() {
        return "<h1> Welcome Homepage </h1>";
    }

    // Just for specific authenticated user (like user with user oder admin role)
    @GetMapping({"/user"})
    public String user() {
        return "<h1> Welcome User</h1>";
    }

    // Just accessible for user with admin role
    @GetMapping({"/uadmin"})
    public String admin() {
        return "<h1> Welcome Admin</h1>";
    }
}
