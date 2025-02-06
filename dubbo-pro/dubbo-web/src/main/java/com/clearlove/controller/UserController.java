package com.clearlove.controller;

import com.clearlove.pojo.User;
import com.clearlove.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.Reference;
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

  /*
    1. 从zookeeper注册中心获取userService的访问Url
    2. 进行远程调用RPC
    3. 将结果封装为一个代理对象。给变量赋值
   */
  @Reference // dubbo 远程注入
  private UserService userService;

  @RequestMapping("/sayHello")
  public String sayHello(){
    return userService.sayHello();
  }


  @RequestMapping("/find")
  public User find(int id){
    return userService.findUserById(id);
  }
}
