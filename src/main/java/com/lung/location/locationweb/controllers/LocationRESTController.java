package com.lung.location.locationweb.controllers;

import com.lung.location.locationweb.entities.Location;
import com.lung.location.locationweb.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                 // annotation to tell spring that it is a restful
@RequestMapping("/locations")   // uri mapping
public class LocationRESTController {
    // injecting the repository
    @Autowired
    LocationRepository locationRepository;
    // implementing the crud operation for REST

    // method to read the locations
    @GetMapping
    public List<Location> getLocations(){
        return locationRepository.findAll();
    }

    // method that creates a location
    @PostMapping
    public Location createLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    // method to update the location
    @PutMapping
    public Location updateLocation(@RequestBody Location location){
        return locationRepository.save(location);
    }

    // method to delete a location
    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id){
        locationRepository.deleteById(id);
    }
}
