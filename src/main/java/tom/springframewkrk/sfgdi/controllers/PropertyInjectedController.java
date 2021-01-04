package tom.springframewkrk.sfgdi.controllers;

import tom.springframewkrk.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
