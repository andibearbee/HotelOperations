package com.pluralsight;

public class Room {

    //defined properties
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
        this.isAvailable = true;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }


    public double getPrice() {
        return this.price;
    }


    public boolean isOccupied() {
        return this.isOccupied;
    }


    public boolean isDirty() {
        return this.isDirty;
    }


    public boolean isAvailable() {
        return this.isAvailable;
    }

    //guest checks in and room is marked as dirty and room is no longer available
    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
        this.isAvailable = false;
    }

    //guest checks out and room is waiting to be cleaned, not available
    public void checkOut(){

        this.isOccupied =false;
    }

    //room is not occupied, is clean, and is available
    public void cleanRoom(){
        this.isDirty = false;
        this.isAvailable = true;
    }
}
