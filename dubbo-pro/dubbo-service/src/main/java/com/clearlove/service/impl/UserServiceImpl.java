package com.clearlove.service.impl;

import com.clearlove.pojo.User;
import com.clearlove.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author promise
 * @date 2025/2/6 - 0:39
 */
// @Service Spring IOC 容器的注解

// 将这个类提供的方法（服务）对外发布。将访问的地址 ip，端口，服务名，版本号，分组等信息发布到注册中心上
// @Service(timeout = 3000, retries = 2) // 当前服务3s超时，重试2次，一共3次
@Service(version = "v1.0", weight = 200)
public class UserServiceImpl implements UserService {

  int i = 1;

  public String sayHello() {
    return "hello dubbo from dubbo-service!";
  }

  // @Override
  // public User findUserById(int id) {
  //
  //   System.out.println("服务被调用了：" + i++);
  //
  //   User user = new User(1, "clearlove", "123456");
  //
  //   // 数据库查询很慢，查了5s
  //   try {
  //     Thread.sleep(5000);
  //   } catch (InterruptedException e) {
  //     e.printStackTrace();
  //   }
  //   return user;
  // }

  @Override
  public User findUserById(int id) {

    System.out.println("old...");

    User user = new User(1, "clearlove", "123456");

    return user;
  }
}




