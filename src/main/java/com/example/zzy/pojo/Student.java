package com.example.zzy.pojo;

import lombok.Data;

import javax.print.DocFlavor;
import java.security.PrivateKey;


@Data
public class Student {
    private Integer id;
    private String name;
    private Teacher teacher;
}
