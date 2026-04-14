package com.aerolinea.airline.rules.model;

public class Equipaje {
    private double weight;
    private boolean allowed = true;

    public Equipaje() {}

    public Equipaje(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }
}