package com.example.springecomdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringEcomDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEcomDemoApplication.class, args);
    }

}
