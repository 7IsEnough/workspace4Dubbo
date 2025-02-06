package com.clearlove.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author promise
 * @date 2025/2/7 - 1:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

  private int id;

  private String username;

  private String password;

}
