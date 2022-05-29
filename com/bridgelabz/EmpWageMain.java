package com.bridgelabz;

import java.util.Random;

public class EmpWageMain {
    private static final int ABSENT_DAY_HOUR = 0;
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int HALF_DAY_HOUR = 4;
    static int IS_FULL_DAY = 1;
    static int IS_ABSENT_TODAY = 0;
    static int IS_HALF_TODAY = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        Random random = new Random();
        int attendance = random.nextInt(3);


        int total_empl_hours=0;
        int total_empl_wage=0;
        if (attendance == IS_ABSENT_TODAY) {
            System.out.println("Employee is absent today");
            total_empl_hours += ABSENT_DAY_HOUR;
            total_empl_wage += WAGE_PER_HOUR*ABSENT_DAY_HOUR;
        } else if (attendance == IS_HALF_TODAY) {
            System.out.println("Half Day today");
            total_empl_hours += HALF_DAY_HOUR;
            total_empl_wage += WAGE_PER_HOUR*HALF_DAY_HOUR;
        } else {
            System.out.println("Employee is Present today");
            total_empl_hours += FULL_DAY_HOUR;
            total_empl_wage += WAGE_PER_HOUR*FULL_DAY_HOUR;
        }
        System.out.println("Total wage:- "+total_empl_wage);
    }
}
