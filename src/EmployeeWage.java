import java.util.Random;

public class EmployeeWage {

    // Method to compute employee wage for a company
    public static void computeEmployeeWage(String company,
                                           int wagePerHour,
                                           int maxWorkingDays,
                                           int maxWorkingHours) {

        Random random = new Random();

        // Employee working hour constants
        int fullTimeHour = 8;
        int partTimeHour = 4;

        // Variables to store total working days, hours and wage
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        // Continue until maximum working days or hours are reached
        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            // Increment working day
            totalWorkingDays++;

            // Generate random attendance
            // 0 = Absent
            // 1 = Full Time
            // 2 = Part Time
            int employeeCheck = random.nextInt(3);

            int employeeHours = 0;

            // Determine employee working hours
            switch (employeeCheck) {

                case 1:
                    employeeHours = fullTimeHour;
                    break;

                case 2:
                    employeeHours = partTimeHour;
                    break;

                default:
                    employeeHours = 0;
            }

            // Add today's working hours
            totalWorkingHours += employeeHours;

            // Calculate today's wage and add to total wage
            totalWage += employeeHours * wagePerHour;
        }

        // Display company wage details
        System.out.println("--------------------------------");
        System.out.println("Company Name        : " + company);
        System.out.println("Wage Per Hour       : " + wagePerHour);
        System.out.println("Working Days        : " + totalWorkingDays);
        System.out.println("Working Hours       : " + totalWorkingHours);
        System.out.println("Total Employee Wage : " + totalWage);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        // Compute wage for Company 1
        computeEmployeeWage("TCS", 20, 20, 100);

        // Compute wage for Company 2
        computeEmployeeWage("Infosys", 25, 22, 120);
    }
}