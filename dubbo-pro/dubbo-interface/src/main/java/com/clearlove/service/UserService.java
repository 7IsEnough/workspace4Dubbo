package com.clearlove.service;
import com.clearlove.pojo.User;

/**
 * @author promise
 * @date 2025/2/6 - 0:38
 */
public interface UserService {
  public String sayHello();

  // 查询用户
  public User findUserById(int id);
}
