package org.mario.springboot.solarsystemapirest.services;

import org.mario.springboot.solarsystemapirest.models.Planet;
import org.mario.springboot.solarsystemapirest.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService{

    @Autowired
    PlanetRepository repository;

    @Override
    public List<Planet> getPlanets() {
        return repository.getPlanets();
    }

    @Override
    public Planet findPlanetById(Long id) {
        return repository.findPlanetById(id);
    }
}
