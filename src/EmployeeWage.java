import java.util.*;
public class EmployeeWage {

   static   Random random = new Random();

    // Employee wage and working hour constants
    static int wagePerHour = 20 ;
    static int partTimeHour = 4;
    static int fullDayHour  = 8;

    // Maximum working days and hours for a month
    static int totalWorkingDays = 20;
    static int totalWorkinghours = 100;

    public static void computeEmployeeWage(){




        // Variables to track total wage, days, and hours worked
        int wage = 0;
        int workingDays = 0;
        int WorkingHours = 0;



        // Loop until maximum working days or working hours are reached
        for(; workingDays < totalWorkingDays &&
                WorkingHours < totalWorkinghours; ){

            workingDays++;

            // Generate random attendance status:
            int  employeeCheck = random.nextInt(3);

            int employee = 0;


            // Determine employee working hours based on attendance
            switch(employeeCheck) {

                case 1 -> employee = fullDayHour;

                case 2 -> employee = partTimeHour;

            }
            // Calculate and add daily wage to total monthly wage

            WorkingHours = WorkingHours + employee;
            wage = wage + (employee * wagePerHour);
        }


        System.out.println("Wage :" + wage);



    }


    public static void  main(String[] args) {

            computeEmployeeWage();

    }
}