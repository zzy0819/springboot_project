package com.example.zzy.pojo;


import lombok.Data;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.security.PrivateKey;
import java.util.Date;

@Data
@Validated
public class Blog {

   private String id;
   private String title;
   private String author;
   private Date createTime;
   private Integer views;
}
