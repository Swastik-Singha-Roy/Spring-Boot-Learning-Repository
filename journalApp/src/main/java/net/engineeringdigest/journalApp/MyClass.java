package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//we made an API!
@RestController
public class MyClass {

    @Autowired //Dependency Injection (just like `Dog dog = new Dog()`)
    private Dog dog; //We are asking Spring for an object of Dog

    @GetMapping("abc") //making end point for the api
    public String something() {
        return dog.fun();
    }
}