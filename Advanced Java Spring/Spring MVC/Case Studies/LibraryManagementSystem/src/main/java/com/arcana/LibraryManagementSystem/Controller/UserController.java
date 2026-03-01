package com.arcana.LibraryManagementSystem.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import com.arcana.LibraryManagementSystem.Model.User;
import com.arcana.LibraryManagementSystem.Service.UserService;

@Controller
@RequestMapping("/users")
@SessionAttributes("loggedUser")
public class UserController {

    @Autowired
    private UserService service;

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }

        service.signIn(user);
        return "redirect:/users/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginUser", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("loginUser") User user,Model model) {

        return service.logIn(user).map(u -> {model.addAttribute("loggedUser", u); return "redirect:/users/dashboard";})
                .orElseGet(() -> {model.addAttribute("error", "Invalid email or password");return "login";});
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/logout")
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:/users/login";
    }
}