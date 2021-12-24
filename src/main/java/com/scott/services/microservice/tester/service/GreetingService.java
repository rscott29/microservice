package com.scott.services.microservice.tester.service;

import com.scott.services.microservice.tester.Greeting;

import java.util.List;

public interface GreetingService {
    List<Greeting> getAllGreetings();
    Greeting getGreetingById(Integer id);
}
