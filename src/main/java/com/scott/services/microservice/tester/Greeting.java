package com.scott.services.microservice.tester;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Greeting {
    @Id
    @GeneratedValue
    private Integer Id;
    private String Message;
    private String MessageAuthor;

}
