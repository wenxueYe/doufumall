package org.ywx.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "org.ywx.project.feign")

@MapperScan("org.ywx.project.dao")
@SpringBootApplication
public class MallProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProjectApplication.class, args);
    }

}
