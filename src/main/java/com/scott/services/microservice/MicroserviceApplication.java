package com.scott.services.microservice;

import com.scott.services.microservice.tester.Greeting;
import com.scott.services.microservice.tester.repository.GreetingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class MicroserviceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroserviceApplication.class);
    }

    @Bean
    public CommandLineRunner SeedGreetings(GreetingRepository greetingRepository) {
        return (args) -> {
            greetingRepository.save(new Greeting(1, "hello","Richard"));
            greetingRepository.save(new Greeting(2, "lovely test", "Bob"));
            greetingRepository.save(new Greeting(3, "Rawr", "Mikasa"));
        };

    }

}
