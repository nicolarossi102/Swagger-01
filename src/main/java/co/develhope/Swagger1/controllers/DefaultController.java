package co.develhope.Swagger1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping
    public String getWelcomeMessage(){
        return "Lasciate ogni speranza voi ch'entrate";
    }

}
