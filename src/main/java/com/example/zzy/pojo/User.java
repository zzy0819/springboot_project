package com.example.zzy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private Integer id;
    private String username;
    private Integer addr;
    private String gender;
    private Integer password;

}




