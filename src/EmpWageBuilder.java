import java.util.*;
public class EmpWageBuilder {

    // Instance variable
    private CompanyEmpWage company;

    // Constructor
    public EmpWageBuilder(CompanyEmpWage company) {
        this.company = company;
    }

    // Method to compute employee wage
    public void computeEmployeeWage() {

        Random random = new Random();

        // Employee working hour constants
        int fullTimeHour = 8;
        int partTimeHour = 4;

        // Variables to track working days, hours and total wage
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        // Continue until maximum working days or hours are reached
        while (totalWorkingDays < company.getMaxWorkingDays() &&
                totalWorkingHours < company.getMaxWorkingHours()) {

            totalWorkingDays++;

            // Generate random attendance
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

            totalWorkingHours += employeeHours;
            totalWage += employeeHours * company.getWagePerHour();
        }

        // Display result
        System.out.println("------------------------------");
        System.out.println("Company Name : " + company.getCompany());
        System.out.println("Total Wage   : " + totalWage);
        System.out.println("------------------------------");
    }

}
