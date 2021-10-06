package com.day8assigment;

public class u4program {

    public static final int IS_PART_TIME = 2;
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static int empWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        for(int day = 0; day < NUM_OF_WORKING_DAYS; day++){

            int random=(int)Math.floor(Math.random()*10) % 3;
            switch (random)
            {
                case IS_FULL_TIME: empHrs = 8;
                    break;
                case IS_PART_TIME: empHrs = 4;
                    break;
                default: empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        return totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Total Emp Wage :" + empWage());
    }
}

