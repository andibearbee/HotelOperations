package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    public Hotel (String name, int numberOfSuites, int numberOfRooms){
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }
    public Hotel (String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms =bookedRooms;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
//availableRooms > the chosen numberOfRooms then update the bookedRooms to reflect the number of occupied rooms

    public boolean bookRoom(int numberOfSuites, int numberOfRooms, boolean isSuite) {
        //numberOfRooms chosen by user is less than the available number of rooms, then they can book that number of rooms
            if(numberOfSuites < getAvailableSuites() && isSuite) {
                bookedSuites += numberOfSuites;
                System.out.println("You have reserved " + numberOfSuites + " Suites.");
                return true;
            } else if ( numberOfRooms < getAvailableRooms() && isSuite != true) {
                bookedRooms += numberOfRooms;
                System.out.println("You have reserved " + numberOfRooms + " Rooms.");
                return true;
            } else {
                System.out.println("No Available Rooms.");
                return false;
            }
        }


    }




