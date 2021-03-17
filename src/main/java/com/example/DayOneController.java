package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class DayOneController {

    @Get("/hola/{person}")
    public String hola(String person){
        return "Hola " + person + "!";
    }
}
