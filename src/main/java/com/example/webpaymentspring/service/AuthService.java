package com.example.webpaymentspring.service;

import com.example.webpaymentspring.exception.RegistrationException;
import com.example.webpaymentspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

  @Autowired
  private UserRepository userRepository;

  public boolean find(String username, String password) {

    if(username == null) {
      return false;
    } else if(password == null) {
      return false;
    }

    String userPassword = userRepository.findPassword(username);

    // enligt GDPR ska lössenrod hashas
    // istället för att matcha "rena" lössneord så matchar vi
    // hashade lössenord mot hashningen av in-lössenordet
    return userPassword.equals(password);
  }

  public boolean create(String username, String password) throws RegistrationException {

    /*if(!password.matches("[@!%]+")) {
      throw new RegistrationException("Special character must be used", false, false);
    }*/

    return userRepository.create(username, password);
  }
}
