package com.lung.location.locationweb.repos;

import com.lung.location.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
