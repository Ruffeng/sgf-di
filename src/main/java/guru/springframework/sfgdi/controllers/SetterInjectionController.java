package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

// Better, but not perfect: The services is through a setter
public class SetterInjectionController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGretting();
    }
}
