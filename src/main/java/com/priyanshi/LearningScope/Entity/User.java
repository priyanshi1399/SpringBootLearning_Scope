package com.priyanshi.LearningScope.Entity;


import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")--at time of singleton keep this
@Scope("prototype")
public class User {

    public User(){
        System.out.println("User initialization");
    }

    @PostConstruct
    public void init(){
        System.out.println("User Object hasCode: "+this.hashCode());
    }


}
