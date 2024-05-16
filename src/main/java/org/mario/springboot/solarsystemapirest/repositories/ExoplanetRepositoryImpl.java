package org.mario.springboot.solarsystemapirest.repositories;

import org.mario.springboot.solarsystemapirest.models.Planet;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("exoplanetsSystem")
public class ExoplanetRepositoryImpl implements PlanetRepository {

    private List<Planet> data;

    public ExoplanetRepositoryImpl() {
        this.data = Arrays.asList(
                new Planet(9L, "Proxima Centauri b", 1.27, 1.1, 4.24 * 63241.1),
                new Planet(10L, "Kepler-186f", 1.17, 1.11, 490 * 63241.1),
                new Planet(11L, "Kepler-452b", 5.0, 1.6, 1400 * 63241.1),
                new Planet(12L, "Trappist-1d", 0.388, 0.773, 39.46 * 63241.1),
                new Planet(13L, "Trappist-1e", 0.692, 0.91, 39.46 * 63241.1),
                new Planet(14L, "Trappist-1f", 1.04, 1.05, 39.46 * 63241.1),
                new Planet(15L, "Trappist-1g", 1.34, 1.13, 39.46 * 63241.1),
                new Planet(16L, "55 Cancri e", 8.08, 2.0, 41 * 63241.1),
                new Planet(17L, "HD 209458 b", 220, 1.38, 150 * 63241.1),
                new Planet(18L, "GJ 1214 b", 6.55, 2.68, 42.5 * 63241.1)
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
