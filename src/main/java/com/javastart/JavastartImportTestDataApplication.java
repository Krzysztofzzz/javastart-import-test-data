package com.javastart;

import com.javastart.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavastartImportTestDataApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavastartImportTestDataApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.findAll().forEach(System.out::println);
    }

}
