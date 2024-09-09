package com.bridgelabz.empwage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        int fullTime = 1;
        int empRatePerHour=20;
        int empHour=0;
        int empWage=0;
        System.out.println("Welcome to the Employee Wage Computation");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == fullTime) {
            System.out.println("Employee Present!");
            empHour = 8;
        } else {
            System.out.println("Employee Absent!");
            empHour = 0;

        }
        empWage=empHour*empRatePerHour;
        System.out.println("Employee Daily Wage is: "+empWage);
    }
}


