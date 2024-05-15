package org.mario.springboot.solarsystemapirest.repositories;

import org.mario.springboot.solarsystemapirest.models.Planet;

import java.util.Arrays;
import java.util.List;

public class PlanetRepositoryImpl implements PlanetRepository{

    private List<Planet> data;

    public PlanetRepositoryImpl() {
    this.data = Arrays.asList(
            new Planet(1L, "Mercury", 0.055, 0.383, 0.39),
            new Planet(2L, "Venus", 0.815, 0.949, 0.72),
            new Planet(3L, "Earth", 1.0, 1.0, 1.0),
            new Planet(4L, "Mars", 0.107, 0.532, 1.52),
            new Planet(5L, "Jupiter", 317.8, 11.21, 5.2),
            new Planet(6L, "Saturn", 95.2, 9.45, 9.58),
            new Planet(7L, "Uranus", 14.5, 4.01, 19.22),
            new Planet(8L, "Neptune", 17.1, 3.88, 30.05)
    );
    }


    @Override
    public List<Planet> getPlanets() {
        return this.data;
    }

    @Override
    public Planet findPlanetById(Long id) {
        return data.stream().filter(p-> p.getId().equals(id)).findFirst().orElse(null);
    }
}
