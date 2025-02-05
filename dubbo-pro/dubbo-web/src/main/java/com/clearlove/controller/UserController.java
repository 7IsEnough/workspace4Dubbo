package com.clearlove.controller;

import com.clearlove.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2025/2/6 - 0:49
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @RequestMapping("/sayHello")
  public String sayHello(){
    return userService.sayHello();
  }
}
