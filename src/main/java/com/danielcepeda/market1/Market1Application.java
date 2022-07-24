package com.danielcepeda.market1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class Market1Application {

    public static void main(String[] args) {
        SpringApplication.run(Market1Application.class, args);
    }

}
