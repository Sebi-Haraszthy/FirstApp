package com.springapps.firstapp.DIwithbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiDemo implements CommandLineRunner {
    @Autowired
    private C c;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(c.generateNumber());
    }

    public static void main(String[] args) {
        SpringApplication.run(DiDemo.class, args);
    }
}