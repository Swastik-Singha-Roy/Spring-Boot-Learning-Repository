package net.engineeringdigest.journalApp;
import  org.springframework.stereotype.Component;

@Component //IOC container will scan this class
public class Dog {

    public String fun() {
        return "Something";
    }
}
