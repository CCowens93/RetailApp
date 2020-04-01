package com.houseawesome.RetailBackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health() {
        // imagine the code checking a few things like the database
        // then returning "ok" or "error"
        return "ok";
    }
}

