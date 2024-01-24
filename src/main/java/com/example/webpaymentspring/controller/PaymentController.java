package com.example.webpaymentspring.controller;

import com.example.webpaymentspring.model.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/payment")
public class PaymentController {

  @GetMapping("/")
  public String getPayments(Model model) {

    List<Payment> payments = new ArrayList<>();
    payments.add(new Payment("Egg", 2));
    payments.add(new Payment("Milk", 65));
    payments.add(new Payment("Wheat", 3));

    model.addAttribute("payments", payments);

    return "payment";
  }
}
