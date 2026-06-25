import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        // Create one EmpWageBuilder object
        EmpWageBuilder builder = new EmpWageBuilder(5);

        // Add multiple companies
        builder.addCompany(new CompanyEmpWage("TCS",20,20,100));
        builder.addCompany(new CompanyEmpWage("Infosys",25,22,120));
        builder.addCompany(new CompanyEmpWage("Wipro",30,25,150));

        // Compute wages for all companies
        builder.computeEmployeeWages();
    }
}