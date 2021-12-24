package com.scott.services.microservice.tester.impl;

import com.scott.services.microservice.tester.Greeting;
import com.scott.services.microservice.tester.repository.GreetingRepository;
import com.scott.services.microservice.tester.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GreetingServiceImpl implements GreetingService {
    private final GreetingRepository greetingRepository;

    @Override
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    @Override
    public Greeting getGreetingById(Integer id) {
        return greetingRepository.getById(id);
    }
}
