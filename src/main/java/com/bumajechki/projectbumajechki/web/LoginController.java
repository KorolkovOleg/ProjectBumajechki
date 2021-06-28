package com.bumajechki.projectbumajechki.web;

import com.bumajechki.projectbumajechki.domain.User;
import com.bumajechki.projectbumajechki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(ModelMap model) {
        model.put("user", new User());

        return "register";
    }

    @PostMapping("/register")
    public String registerPost(@ModelAttribute User user) {
        User savedUser = userService.save(user);
        System.out.println(user.toString());

        return "redirect:/login";
    }
}
