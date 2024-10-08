package com.bridgelabz.empwage;

import java.util.HashMap;
import java.util.Map;

class CompanyEmpWage {
    public final String companyName;
    public final int empRatePerHour;
    public final int numWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage;
    private Map<Integer, Integer> dailyWages;


    public CompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.dailyWages = new HashMap<>(); // Initialize the map

    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    public void addDailyWage(int day, int wage) {
        dailyWages.put(day, wage);
    }


    @Override
    public String toString() {
        return "Total Employee Wage for company " + companyName + " is " + totalWage;
    }
}