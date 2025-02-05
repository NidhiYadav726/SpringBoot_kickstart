package com.example.demo.Service;

import org.springframework.stereotype.Service;



// Service handles Business Logic
@Service
public class GreetingService {
    public String getGreeting() {
        return "Welcome to Spring Boot!";
    }
}

//Modified Service Class to use data from Repository.

//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    @Autowired
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    public String getGreeting() {
//        return greetingRepository.fetchMessage();  // Fetch from repository
//    }
//}

