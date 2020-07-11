package com.coderscampus;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderTest {
  
  @Test
  public void encrypt_password () {
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    String encodedPassword = passwordEncoder.encode("password123");
    
    System.out.println(encodedPassword);
  }
}
