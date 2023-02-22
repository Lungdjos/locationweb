package com.lung.location.locationweb.service.implementation;

import com.lung.location.locationweb.entities.Location;
import com.lung.location.locationweb.repos.LocationRepository;
import com.lung.location.locationweb.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    // adding the dependencies
    @Autowired
    private LocationRepository locationRepository;
    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location findLocationById(int id) {
        return locationRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
