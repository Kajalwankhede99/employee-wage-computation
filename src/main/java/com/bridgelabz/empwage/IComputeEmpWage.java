package com.bridgelabz.empwage;

public interface IComputeEmpWage {

        void addCompanyEmpWage(String companyName, int empRatePerHour, int numWorkingDays, int maxHoursPerMonth);
        void computeEmpWage();
        int getTotalWage(String company);
    }

