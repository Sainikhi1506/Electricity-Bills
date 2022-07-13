package com.example.controllers;

import com.example.model.Customer;

import com.example.service.AdminService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private AdminService adminService;
 
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }


    //Check for Credentials
    @PostMapping("/login")
    public String login(@ModelAttribute(name = "loginForm") Customer login, Model m) {
        String uname = login.getUsername();
        String pass = login.getPassword();
        Customer customer = adminService.checkUserNamePassword(uname, pass);
        if (customer !=null) {
            m.addAttribute("uname", uname);
            m.addAttribute("pass", pass);
            return "connection";
        }
        m.addAttribute("error", "Incorrect Username & Password");
        return "login";
        
    }
        @PostMapping("/connection")
        public String connection()
        {
        	return "index";
        }

        @PostMapping("/add")
        public String add()
        {
        	return "address";
        }
        

        @PostMapping("/read")
        public String read()
        {
        	return "reading";
        }
        
        @PostMapping("/pay")
        public String pay()
        {
        	return "payment";
        }
        

        @PostMapping("/sta")
        public String sta()
        {
        	return "status";
        }
}
