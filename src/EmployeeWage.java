import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        // Create company objects
        CompanyEmpWage tcs =
                new CompanyEmpWage("TCS", 20, 20, 100);

        CompanyEmpWage infosys =
                new CompanyEmpWage("Infosys", 25, 22, 120);

        // Create EmpWageBuilder object for each company
        EmpWageBuilder builder1 = new EmpWageBuilder(tcs);
        builder1.computeEmployeeWage();

        EmpWageBuilder builder2 = new EmpWageBuilder(infosys);
        builder2.computeEmployeeWage();
    }
}