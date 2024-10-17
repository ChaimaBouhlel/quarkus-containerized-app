package org.acme.getting.started;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    //new comment
    public String greeting(String name) {
        return "hello " + name;
    }

}
