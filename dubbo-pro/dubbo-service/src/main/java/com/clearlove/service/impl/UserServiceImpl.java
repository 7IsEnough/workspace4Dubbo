package com.clearlove.service.impl;

import com.clearlove.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author promise
 * @date 2025/2/6 - 0:39
 */
@Service
public class UserServiceImpl implements UserService {

  public String sayHello() {
    return "hello dubbo!";
  }
}
