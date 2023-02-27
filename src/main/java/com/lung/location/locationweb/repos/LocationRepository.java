package com.lung.location.locationweb.repos;

import com.lung.location.locationweb.entities.Location;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//@EntityScan("com.lung.location.locationweb.entities")
public interface LocationRepository extends JpaRepository<Location, Integer> {
    @Query("select type,count(type) from Location group by type")
    public List<Object[]> findTypeAndCountType();
}
