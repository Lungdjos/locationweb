package com.lung.location.locationweb.controllers;

import com.lung.location.locationweb.entities.Location;
import com.lung.location.locationweb.repos.LocationRepository;
import com.lung.location.locationweb.service.LocationService;
import com.lung.location.locationweb.utils.EmailUtil;
import com.lung.location.locationweb.utils.ReportUtil;
import jakarta.mail.MessagingException;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
public class LocationController {
    // injections
    // repository and the service
    @Autowired
    LocationRepository locationRepository;
    @Autowired
    LocationService locationService;

    // mail and report utility
    @Autowired
    EmailUtil emailUtil;
    @Autowired
    ReportUtil reportUtil;

    // servlet context
    @Autowired
    ServletContext servletContext;

    // method that returns a jsp page
    @GetMapping("/createLocation")
    public String showCreate(){return "createLocation";}

    // method to save an entity
    @RequestMapping("/saveLocation")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap) throws MessagingException {
        Location savedLocation = locationService.saveLocation(location);
        String pop_up_msg = "Location successfully saved with id: "+ savedLocation.getId();
        modelMap.addAttribute("pop_up_msg", pop_up_msg);

        // sending a mail when the location is saved, to the user
//        emailUtil.sendEmailString("testmail123@gmail.com", "testmail123@gmail.com", "Location Saved Successfully",
//                "The location has been saved with the following details" + location.toString());

        // unfortunately the above functionality can not be implemented as the host can not be accessed by less secure third-party applications

        return "displayLocations";
    }

    // method to show the data in the database
    @RequestMapping("/showLocations")
    public String showLocations(ModelMap modelMap){
        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

    // method to delete an entity from the database
    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        Location delLocation = locationService.findLocationById(id);
        locationService.deleteLocation(delLocation);
        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

    // method that updates a single entity in a database
    @RequestMapping("editLocation")
    public String showUpdate(@RequestParam("id")int id, ModelMap modelMap){
        Location location = locationService.findLocationById(id);
        modelMap.addAttribute("location", location);
        return "updateLocation";
    }

    // method to save an updated entity
    @RequestMapping("/updateLocation")
    public String updateLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        locationService.updateLocation(location);
        // pop up msg
        String pop_up_msg = "Location successfully updated with id: "+ location.getId();
        modelMap.addAttribute("pop_up_msg", pop_up_msg);

        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations", locations);

        return "displayLocations";
    }

    // generating a report controller method
    @RequestMapping("/generateReport")
    public String generateReport() throws IOException {
        // getting the path
        String path = servletContext.getRealPath("/");
        List<Object []> data = locationRepository.findTypeAndCountType();

        reportUtil.generatePieChart(path, data);
        return "locationReport";
    }
}
