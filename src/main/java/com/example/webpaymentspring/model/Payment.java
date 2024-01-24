package com.example.webpaymentspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
  private String title;
  private int sum;
}
