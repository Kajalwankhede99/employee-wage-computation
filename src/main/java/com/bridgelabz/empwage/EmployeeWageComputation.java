package com.bridgelabz.empwage;

public class EmployeeWageComputation {

    public static final int fullTime = 1;
    public static final int partTime=2;
    public static final int empRatePerHour=20;
    public static final int numOfWorkingDays=20;
    public static final int maxHourMonth=10;

    public static int calculateEmpWage(){
        int empHour = 0;
        int totalEmpHour=0;
        int totalWorkingDays=0;
        System.out.println("Welcome to the Employee Wage Computation");
        while(totalEmpHour <= maxHourMonth && totalWorkingDays<numOfWorkingDays){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
                    break;
            }
            totalEmpHour+=empHour;
            System.out.println("Total Working Days: "+totalWorkingDays+ " Employee Hours: "+empHour);
        }

        int totalEmpWage=totalEmpHour*empRatePerHour;
        System.out.println("Total Employee Wage is: " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        calculateEmpWage();
    }
}





