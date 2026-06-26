public class EmployeeWage {

    public static void main(String[] args) {

        IEmpWageBuilder builder = new EmpWageBuilder();

        // Add companies
        builder.addCompany(new CompanyEmpWage("TCS",20,20,100));
        builder.addCompany(new CompanyEmpWage("Infosys",25,22,120));
        builder.addCompany(new CompanyEmpWage("Wipro",30,25,150));

        // Compute wages

        builder.computeEmployeeWages();
    }
}