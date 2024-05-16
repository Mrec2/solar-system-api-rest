package org.mario.springboot.solarsystemapirest.controllers;


import org.mario.springboot.solarsystemapirest.models.Planet;
import org.mario.springboot.solarsystemapirest.services.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlanetRestController {

    @Autowired
    PlanetService planetService;

    @GetMapping()
    public List<Planet> getPlanets(){
      return  planetService.getPlanets();
    }

    @GetMapping("/{id}")
    public Planet findPlanetById(@PathVariable Long id){
        return planetService.findPlanetById(id);
    }
}
