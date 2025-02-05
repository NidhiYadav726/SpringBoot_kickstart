package com.example.demo.Model;


import org.springframework.stereotype.Repository;

// Repository or Model handles Database Operations
@Repository
public class GreetingRepository {
    public String fetchMessage() {
        return "Hello from SpringBoot!";
    }
}


