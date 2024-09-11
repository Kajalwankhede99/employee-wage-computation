package com.bridgelabz.empwage;

class CompanyEmpWage {
    public final String companyName;
    public final int empRatePerHour;
    public final int numWorkingDays;
    public final int maxHoursPerMonth;
    private int totalWage;

    public CompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numWorkingDays = numWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for company " + companyName + " is " + totalWage;
    }
}