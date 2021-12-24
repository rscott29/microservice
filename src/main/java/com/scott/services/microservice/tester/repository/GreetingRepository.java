package com.scott.services.microservice.tester.repository;

import com.scott.services.microservice.tester.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
