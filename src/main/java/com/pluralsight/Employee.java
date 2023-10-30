package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;

    private double payRate;
    private double hoursWorked;

    //getters
    public double getTotalPay(){
        double totalPay = hoursWorked * payRate;
        return totalPay;
    }
    public double getRegularHours(){
        return hoursWorked;
    }

    public double getOvertimeHours(){
        double overtimeHours = hoursWorked - 40;
        return overtimeHours;

    }



}