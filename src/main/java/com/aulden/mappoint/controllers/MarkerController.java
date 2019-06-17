package com.aulden.mappoint.controllers;

import com.aulden.mappoint.models.Marker;
import com.aulden.mappoint.services.MarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("markers")
public class MarkerController {

    @Autowired
    private MarkerService ms;

    @GetMapping
    public List<Marker> findAll() {
        System.out.println("Finding all markers");
        return ms.findAll();
    }

    @PostMapping
    public void create(@RequestBody Marker newMarker) {
        System.out.println("Creating new marker");
        ms.create(newMarker);
    }

    @DeleteMapping
    public void delete(@RequestBody Marker delMarker){
        System.out.println("Deleting marker");
        ms.delete(delMarker);
    }
}
