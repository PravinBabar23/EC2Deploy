package com.ec2demo.EC2Deploy;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public String home() {
        return "Hello AWS from Spring Boot!";
    }

    @GetMapping("/health")
    public String health() {
        return "App is running fine!";
    }
}
