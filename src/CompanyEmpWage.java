import java.util.ArrayList;
import java.util.Random;

public class CompanyEmpWage {

    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    private ArrayList<Integer> dailyWages = new ArrayList<>();
    private int totalWage;

    public CompanyEmpWage(String company,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void computeEmployeeWage() {

        Random random = new Random();

        int fullTimeHour = 8;
        int partTimeHour = 4;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

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

            int dailyWage = employeeHours * wagePerHour;

            dailyWages.add(dailyWage);

            totalWage += dailyWage;
        }
    }

    public String getCompany() {
        return company;
    }

    public int getTotalWage() {
        return totalWage;
    }

    @Override
    public String toString() {

        return "Company Name : " + company +
                "\nDaily Wages : " + dailyWages +
                "\nTotal Wage  : " + totalWage;
    }
}