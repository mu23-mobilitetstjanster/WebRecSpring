package com.example.webpaymentspring.controller;

import com.example.webpaymentspring.exception.RegistrationException;
import com.example.webpaymentspring.service.AuthService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/home")
public class HomeController {

  @Autowired
  private AuthService authService;

  @GetMapping("/")
  public String getLandingPage() {
    return "index";
  }

  @GetMapping("/register")
  public String getRegisterForm() {
    return "register";
  }

  @GetMapping("/login")
  public String getLoginForm() {
    return "login";
  }

  @PostMapping("/register")
  public String registerUser(@RequestParam String username, @RequestParam String password) {

    try {
      authService.create(username, password);
    } catch (RegistrationException e) {
      e.printStackTrace();
    }

    return "redirect:/home/register";
  }

}
