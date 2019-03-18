package com.aulden.mappoint.repos;

import com.aulden.mappoint.models.Marker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepo extends JpaRepository<Marker, Integer> {

}
