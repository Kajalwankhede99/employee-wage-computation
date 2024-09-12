package com.bridgelabz.empwage;

import java.util.*;

public class EmpWageBuilder implements IComputeEmpWage{

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    private List<CompanyEmpWage> companyEmpWageList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;

    public EmpWageBuilder() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    @Override
    public void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, empRatePerHour, numWorkingDays, maxHoursPerMonth);
        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(companyName, companyEmpWage);
    }

    @Override
    public void computeEmpWage() {
        for (CompanyEmpWage companyEmpWage : companyEmpWageList) {
            int totalWage = calculateEmpWage(companyEmpWage);
            companyEmpWage.setTotalWage(totalWage);
            System.out.println(companyEmpWage);
        }
    }

    private int calculateEmpWage(CompanyEmpWage companyEmpWage) {
        int empHour = 0;
        int totalEmpHour = 0;
        int totalWorkingDays = 0;

        System.out.println("Welcome to the Employee Wage Computation");
        while (totalEmpHour <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case PART_TIME:
                    empHour = 4;
                    System.out.println("Employee is Part time.");
                    break;

                case FULL_TIME:
                    empHour = 8;
                    System.out.println("Employee is Full time.");
                    break;
                default:
                    empHour = 0;
                    System.out.println("Employee is Absent.");
                    break;
         }

            totalEmpHour += empHour;
            System.out.println("Total Working Days: " + totalWorkingDays + " Employee Hours: " + empHour);
            int dailyWage = empHour * companyEmpWage.empRatePerHour;
            companyEmpWage.addDailyWage(totalWorkingDays, dailyWage); // Store daily wage

        }

            int totalEmpWage = totalEmpHour * companyEmpWage.empRatePerHour;
            System.out.println("Total Employee Wage for company  is: " + totalEmpWage);
            return totalEmpWage;
    }

      public static void main(String[] args) {
          IComputeEmpWage emp = new EmpWageBuilder();
          emp.addCompanyEmpWage("Relience",10,2,100);
          emp.addCompanyEmpWage("Wipro",20,4,100);
          emp.addCompanyEmpWage("Accenture", 20, 8, 100);
          emp.computeEmpWage();
        }
}

