package com.aerolinea.airline.rules.model;

public class Pasajero {
    private String name;
    private int age;
    private String membership;
    private String seatPreference;
    private boolean travelingWithChildren;
    private boolean priorityCheckIn;
    private boolean eligibleForUpgrade = true;
    private boolean vipLoungeAccess;
    private String seatAssigned;
    private String travelClass = "Economy";
    private double discount;
    private int loyaltyPoints;
    private double compensation;

    public Pasajero() {}

    public Pasajero(String name, int age, String membership, String seatPreference, boolean travelingWithChildren) {
        this.name = name;
        this.age = age;
        this.membership = membership;
        this.seatPreference = seatPreference;
        this.travelingWithChildren = travelingWithChildren;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getMembership() { return membership; }
    public String getSeatPreference() { return seatPreference; }
    public boolean isTravelingWithChildren() { return travelingWithChildren; }
    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public String getSeatAssigned() { return seatAssigned; }
    public String getTravelClass() { return travelClass; }
    public double getDiscount() { return discount; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public double getCompensation() { return compensation; }

    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }
    public void setSeatAssigned(String seatAssigned) { this.seatAssigned = seatAssigned; }
    public void setTravelClass(String travelClass) { this.travelClass = travelClass; }
    public void setDiscount(double discount) { this.discount = discount; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public void setCompensation(double compensation) { this.compensation = compensation; }
}