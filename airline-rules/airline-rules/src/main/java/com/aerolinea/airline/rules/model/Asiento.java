package com.aerolinea.airline.rules.model;

public class Asiento {
    private String type;
    private boolean available;

    public Asiento() {}

    public Asiento(String type, boolean available) {
        this.type = type;
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}