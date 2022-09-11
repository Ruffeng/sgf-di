package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;


//Less prefered: Manual injection for services and tightly coupled
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGretting();
    }
}
