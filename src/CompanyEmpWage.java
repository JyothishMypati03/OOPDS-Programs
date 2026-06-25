public class CompanyEmpWage {

    // Instance variables
    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    // Constructor
    public CompanyEmpWage(String company, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Getters
    public String getCompany() {
        return company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }


}
