package com.priyanshi.LearningScope.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    User user;

    public Student(){
        System.out.println("Student instance Initialization");

    }

    @PostConstruct
    public void init(){
        System.out.println("Student Object hashCode: "+this.hashCode() +
                "User object hashCode: "+user.hashCode());
    }
}
