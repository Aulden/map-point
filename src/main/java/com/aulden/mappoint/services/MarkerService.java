package com.aulden.mappoint.services;

import com.aulden.mappoint.models.Marker;
import com.aulden.mappoint.repos.MarkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkerService {

    @Autowired
    private MarkerRepo mr;

    public List<Marker> findAll(){
        return mr.findAll();
    }
}
