package com.aerolinea.airline.rules.model;

public class Vuelo {
    private int delayMinutes;
    private double durationHours;

    public Vuelo() {}

    public Vuelo(int delayMinutes, double durationHours) {
        this.delayMinutes = delayMinutes;
        this.durationHours = durationHours;
    }

    public int getDelayMinutes() {
        return delayMinutes;
    }

    public double getDurationHours() {
        return durationHours;
    }
}