package eu.malanik.osmorc.plugin.example;

import org.osgi.service.component.annotations.Component;

@Component
public class Service {

    public String greetings(String name) {
        return "Hello " + name;
    }

}
