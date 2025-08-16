package com.priyanshi.LearningScope.Controller;


import com.priyanshi.LearningScope.Entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/api")
public class TestController1 {

    @Autowired
    User user;

    public TestController1(){
        System.out.println("TestController1 instance Initialization");
    }


    @PostConstruct
    public void init(){
        System.out.println("TestController1 object hascode:" +this.hashCode() +"user object hashcode: "+user.hashCode());

    }


    @GetMapping(path="/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetchUser Api Invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
