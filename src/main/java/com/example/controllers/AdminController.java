package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.example.model.Customer;


@RestController
@RequestMapping({"/customers"})
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping(path = {"/all"})
    public List<Customer> getCustomers() {
        return adminService.findAll();
    }

    @DeleteMapping(path = {"/{id}"})
    public Customer delete(@PathVariable("id") int id) {
        Customer deletedCus = null;
        return deletedCus;
    }


    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount( @ModelAttribute Customer customer, BindingResult result, Model model) {
        if(result.hasErrors()){
            System.out.println("There was a error "+result);
            System.out.println("Person is: "+ customer.getEmail());
        }

        model.addAttribute("person", customer);

        adminService.save(customer);
        return "redirect:/registration?success";
    }


    @PostMapping(path = {"/create"})
    public void create(@RequestBody Customer customer) {
        adminService.save(customer);

    }


}