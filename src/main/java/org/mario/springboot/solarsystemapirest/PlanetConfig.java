package org.mario.springboot.solarsystemapirest;

import org.mario.springboot.solarsystemapirest.models.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:planets.properties")
public class PlanetConfig {

    @Autowired
    Environment env;

    @Bean
    public List<Planet> planets() {
        List<Planet> planets = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            Long id = Long.parseLong(env.getProperty("planet." + i + ".id"));
            String name = env.getProperty("planet." + i + ".name");
            double mass = Double.parseDouble(env.getProperty("planet." + i + ".mass"));
            double radius = Double.parseDouble(env.getProperty("planet." + i + ".radius"));
            double distanceFromSun = Double.parseDouble(env.getProperty("planet." + i + ".distanceFromSun"));
            planets.add(new Planet(id, name, mass, radius, distanceFromSun));
        }
        return planets;
    }

}
