package org.mario.springboot.solarsystemapirest.models;

public class Planet {


    //All units in relation with Earth.

    private Long id;
    private String name;
    private double mass;
    private double radius;
    private double distanceFromSun;

    public Planet() {
    }

    public Planet(Long id, String name, double mass, double radius, double distanceFromSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planet id=" + id + ", name=" + name + ", mass=" + mass + " Earth masses, radius=" + radius +
                " Earth radii, distanceFromSun=" + distanceFromSun + " AU";
    }
}

