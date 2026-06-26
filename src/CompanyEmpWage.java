import java.util.ArrayList;
import java.util.Random;

public class CompanyEmpWage {

    // Instance variables
    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    // Store daily wages
    private ArrayList<Integer> dailyWages = new ArrayList<>();

    // Store total wage
    private int totalWage;

    // Constructor
    public CompanyEmpWage(String company,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Compute employee wage
    public void computeEmployeeWage() {

        Random random = new Random();

        int fullTimeHour = 8;
        int partTimeHour = 4;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            // Attendance
            int employeeCheck = random.nextInt(3);

            int employeeHours = 0;

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

            // Calculate daily wage
            int dailyWage = employeeHours * wagePerHour;

            // Store daily wage
            dailyWages.add(dailyWage);

            // Add to total wage
            totalWage += dailyWage;
        }
    }

    @Override
    public String toString() {

        return "Company Name : " + company +
                "\nDaily Wages : " + dailyWages +
                "\nTotal Wage  : " + totalWage;
    }
}