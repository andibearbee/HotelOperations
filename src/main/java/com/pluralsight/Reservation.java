package com.pluralsight;

public class Reservation {
    //defined variables
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

//boa constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //getters

    public String getRoomType() {
        return this.roomType;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    //setters
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void isWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    //getter for Reservation Total
    public double getReservationTotal() {
        double reservationTotal;
        if(this.roomType.equalsIgnoreCase("King")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
        if(this.isWeekend()) {
            double roomPrice = this.price * this.numberOfNights;
            reservationTotal = (roomPrice * .10) + roomPrice;
        } else {
            reservationTotal = this.price * this.numberOfNights;
        }
        return reservationTotal;
    }

}
