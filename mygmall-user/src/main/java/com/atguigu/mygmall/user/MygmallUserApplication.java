package com.atguigu.mygmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.atguigu.mygmall.user.mapper")
public class MygmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MygmallUserApplication.class, args);
    }
}
