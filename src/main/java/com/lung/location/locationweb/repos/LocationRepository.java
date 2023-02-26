package com.lung.location.locationweb.repos;

import com.lung.location.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {

    @Query("select type,count(type) from location group by type")
    List<Object []> findTypeAndCountType();
}
