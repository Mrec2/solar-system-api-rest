package org.mario.springboot.solarsystemapirest.repositories;

import org.mario.springboot.solarsystemapirest.models.Planet;

import java.util.List;

public interface PlanetRepository {

    List<Planet> getPlanets();
    Planet findPlanetById(Long id);

}
