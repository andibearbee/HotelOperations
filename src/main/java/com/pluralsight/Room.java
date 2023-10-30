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


    public boolean getisOccupied() {
        return isOccupied;
    }


    public boolean getisDirty() {
        return isDirty;
    }


    public boolean getisAvailable() {
        return isAvailable;
    }
    //guest checks in and room is marked as dirty
    public void checkIn(){
        isOccupied = true;
        isDirty = true;

    }
    //guest checks out and room has yet to be cleaned
    public void checkOut(){
        isOccupied =false;
        isDirty = true;

    }
    //no guest in room and it has been cleaned
    public void cleanRoom(){
        isDirty = false;
    }
}
