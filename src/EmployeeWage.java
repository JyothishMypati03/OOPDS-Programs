public class EmployeeWage {

    public static void main(String[] args) {

        IEmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany(new CompanyEmpWage("TCS",20,20,100));
        builder.addCompany(new CompanyEmpWage("Infosys",25,22,120));
        builder.addCompany(new CompanyEmpWage("Wipro",30,25,150));

        builder.computeEmployeeWages();

        System.out.println();
        System.out.println("TCS Total Wage      : " + builder.getTotalWage("TCS"));
        System.out.println("Infosys Total Wage  : " + builder.getTotalWage("Infosys"));
        System.out.println("Wipro Total Wage    : " + builder.getTotalWage("Wipro"));
    }
}