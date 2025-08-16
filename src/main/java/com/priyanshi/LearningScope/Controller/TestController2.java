package com.priyanshi.LearningScope.Controller;



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
@RequestMapping(value="/api")
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TestController2 {
    
    
    @Autowired
    User user;

    public TestController2(){
        System.out.println("TestController2 instance Initialization");
    }


    @PostConstruct
    public void init(){
        System.out.println("TestController2 object hashcode:" +this.hashCode() +"user object hashcode: "+user.hashCode());

    }


    @GetMapping(path="/fetchUser2")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetchUser2 Api Invoked");
        return ResponseEntity.status(HttpStatus.OK).body("");
    }
}
