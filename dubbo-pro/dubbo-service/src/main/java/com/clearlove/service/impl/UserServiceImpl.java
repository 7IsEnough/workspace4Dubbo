package com.clearlove.service.impl;

import com.clearlove.pojo.User;
import com.clearlove.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author promise
 * @date 2025/2/6 - 0:39
 */
// @Service Spring IOC 容器的注解

@Service // 将这个类提供的方法（服务）对外发布。将访问的地址 ip，端口，服务名，版本号，分组等信息发布到注册中心上
public class UserServiceImpl implements UserService {

  public String sayHello() {
    return "hello dubbo from dubbo-service!";
  }

  @Override
  public User findUserById(int id) {

    User user = new User(1, "clearlove", "123456");
    return user;
  }
}
