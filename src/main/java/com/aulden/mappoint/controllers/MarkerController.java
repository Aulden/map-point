package com.aulden.mappoint.controllers;

import com.aulden.mappoint.models.Marker;
import com.aulden.mappoint.services.MarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
