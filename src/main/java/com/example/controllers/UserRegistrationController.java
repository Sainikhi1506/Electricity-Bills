package com.example.controllers;

import com.example.model.Connection;
import com.example.model.Customer;
import com.example.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {


    private AdminService adminService;

    public UserRegistrationController(AdminService adminService) {
        super();
        this.adminService = adminService;
    }


    @ModelAttribute("customer")
    public Customer CustomerDto()
    {
        return new Customer();
    }

    @GetMapping
    public String showRegistrationForm()
    {
        return "registration";
    }

    @PostMapping
    public String createCustomer(@ModelAttribute("customer") Customer customer)
    {
        adminService.save(customer);
        return "redirect:/registration?success";
    }

   

}
