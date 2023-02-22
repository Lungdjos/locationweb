package com.lung.location.locationweb.service;

import com.lung.location.locationweb.entities.Location;

import java.util.List;

public interface LocationService {

    // method to save the location
    Location saveLocation(Location location);

    // method to update the location
    Location updateLocation(Location location);
    // method to delete the location
    void deleteLocation(Location location);

    // method to find the location individual location
    Location findLocationById(int id);

    // method to get the list of the locations
    List<Location> getAllLocations();
}
