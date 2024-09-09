package com.bridgelabz.empwage;

public class EmployeeWageComputation {

    public static final int fullTime = 1;
    public static final int partTime=2;
    public static final int empRatePerHour=20;

   public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;
        System.out.println("Welcome to the Employee Wage Computation");
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck) {
            case partTime:
                empHour = 4;
                System.out.println("Employee is Part time.");
                break;

            case fullTime:
                empHour = 8;
                System.out.println("Employee is Full time.");
                break;
            default:
                System.out.println("Absent");
                break;
        }
        empWage=empHour*empRatePerHour;
        System.out.println("Employee Daily Wage is: "+empWage);
    }
}



