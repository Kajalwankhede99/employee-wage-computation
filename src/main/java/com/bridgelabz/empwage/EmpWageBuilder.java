package com.bridgelabz.empwage;

public class EmpWageBuilder {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    private final String companyName;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHourMonth;
    private int totalEmpWage;

    public EmpWageBuilder(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHourMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourMonth = maxHourMonth;
    }

    public void calculateEmpWage() {
        int empHour = 0;
        int totalEmpHour = 0;
        int totalWorkingDays = 0;

        System.out.println("Welcome to the Employee Wage Computation for " + companyName);
        while (totalEmpHour <= maxHourMonth && totalWorkingDays < numOfWorkingDays) {
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
          }

            totalEmpWage = totalEmpHour * empRatePerHour;
            System.out.println("Total Employee Wage for company " + companyName + " is " + totalEmpWage);
     }

        @Override
        public String toString() {
            return "Total Employee Wage for company: " + companyName + " is " + totalEmpWage;
    }

      public static void main(String[] args) {
        EmpWageBuilder wipro = new EmpWageBuilder("Wipro", 20, 2, 100);
        EmpWageBuilder relianceJio = new EmpWageBuilder("Reliance Jio", 30, 4, 100);

        wipro.calculateEmpWage();
        System.out.println(wipro);

        relianceJio.calculateEmpWage();
        System.out.println(relianceJio);
        }
}

