package com.lung.location.locationweb.controllers;

import com.lung.location.locationweb.entities.Location;
import com.lung.location.locationweb.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LocationController {
    @Autowired
    LocationService locationService;

    // method that returns a jsp page
    @GetMapping("/createLocation")
    public String showCreate(){return "createLocation";}

    @RequestMapping("/saveLocation")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedLocation = locationService.saveLocation(location);
        String pop_up_msg = "Location Successfully Saved with Id: "+ savedLocation.getId();
        modelMap.addAttribute("pop_up_msg", pop_up_msg);
        return "creatLocation";}
}
