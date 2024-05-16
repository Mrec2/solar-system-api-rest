package org.mario.springboot.solarsystemapirest.services;

import org.mario.springboot.solarsystemapirest.models.Planet;

import java.util.List;

public interface PlanetService {

    List<Planet> getPlanets();
    Planet findPlanetById(Long id);

}
