package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }


    public double getPrice() {
        return price;
    }


    public boolean getOccupied() {
        return isOccupied;
    }


    public boolean getDirty() {
        return isDirty;
    }


    public boolean getAvailable() {
        return isAvailable;
    }

}
