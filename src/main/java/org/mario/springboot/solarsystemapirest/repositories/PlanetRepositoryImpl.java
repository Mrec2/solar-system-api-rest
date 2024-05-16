package org.mario.springboot.solarsystemapirest.repositories;

import org.mario.springboot.solarsystemapirest.models.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Primary
@Repository("planetsSystem")
public class PlanetRepositoryImpl implements PlanetRepository{

    private List<Planet> data;

    @Autowired
    public PlanetRepositoryImpl(List<Planet> data) {
    this.data = data;
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
