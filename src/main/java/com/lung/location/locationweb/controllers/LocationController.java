package com.lung.location.locationweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
    // method that returns a jsp page
    @RequestMapping("/showCreate")
    String showCreate(){

        return "createLocation";
    }
}
