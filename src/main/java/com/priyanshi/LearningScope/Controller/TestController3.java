package com.priyanshi.LearningScope.Controller;


import com.priyanshi.LearningScope.Entity.Student;
import com.priyanshi.LearningScope.Entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping(value="/api")
public class TestController3 {

    @Autowired
    User user;

    @Autowired
    Student student;


    public TestController3() {
        System.out.println("TestController3 instance Initialization");
    }


    @PostConstruct
    public void init() {
        System.out.println("TestController3 object hashcode:" + this.hashCode() + "user object hashcode: " + user.hashCode() + "Student Object HashCode : "+student.hashCode());

    }


    @GetMapping(path = "/fetchUser3")
    public ResponseEntity<String> getUserDetails() {
        System.out.println("fetchUser Api Invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}