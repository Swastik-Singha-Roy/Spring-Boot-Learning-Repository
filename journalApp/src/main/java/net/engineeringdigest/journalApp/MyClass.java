package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//we made an API!
@RestController
public class MyClass {

    @GetMapping("abc")
    public String sayHello() {
        return "Hello";
    }
}