package com.yarabeauty.controller;

import com.yarabeauty.domain.Role;
import com.yarabeauty.domain.User;
import com.yarabeauty.repo.UserRepository;
import com.yarabeauty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.Valid;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
        if(!user.getPassword().equals(user.getPasswordConfirm())){
            model.addAttribute("passwordConfirm","Passwords don`t match");
            return "registration";
        }
        if(bindingResult.hasErrors())
            return "registration";

        if (!userService.saveUser(user)){
            model.addAttribute("username", "User already exists");
            return "registration";
        }
        return "redirect:/";
    }
}
