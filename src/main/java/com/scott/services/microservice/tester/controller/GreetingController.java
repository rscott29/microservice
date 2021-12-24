package com.scott.services.microservice.tester.controller;

import com.scott.services.microservice.tester.Greeting;
import com.scott.services.microservice.tester.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService greetingService;

    @GetMapping("/greetings")
   ResponseEntity< List<Greeting>> getAllGreetings() {
        var greetings = greetingService.getAllGreetings();

        return new ResponseEntity<>(greetings, HttpStatus.OK);
    }
}
