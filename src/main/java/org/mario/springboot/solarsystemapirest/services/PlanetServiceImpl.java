package org.mario.springboot.solarsystemapirest.services;

import org.mario.springboot.solarsystemapirest.models.Planet;

import java.util.List;

public class PlanetServiceImpl implements PlanetService{


    @Override
    public List<Planet> getPlanets() {
        return List.of();
    }

    @Override
    public Planet findPlanetById(Long id) {
        return null;
    }
}
