package com.pluralsight;
import java.time.LocalDateTime;
public class Employee {

    private int employeeId;
    private String name;
    private String department;

    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public double getRegularHours(){
        if(hoursWorked <= 40) {
            return this.hoursWorked;
        }

        return 40;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    public double getOvertimeHours(){
        double overtimeHours = hoursWorked - 40;
        if(hoursWorked > 40) {
            return overtimeHours;
        }
        return 0;
    }
    //overtime pay is payRate * (regularPay * time and a half )


    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * (payRate * 1.5));

    }


    public void punchIn(double time){
       this.startTime = time;
    }
    public void punchOut(double time){
        this.hoursWorked += (time - this.startTime);

    }
    public void punchIn() {
        this.startTime = LocalDateTime.now().getHour();
    }
    public void punchOut() {
        this.hoursWorked += (LocalDateTime.now().getHour() - this.startTime);
    }



}