package com.lung.location.locationweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LocationController {
    // method that returns a jsp page
    @GetMapping("/createLocation")
    public String showCreate(){return "createLocation";}
}
