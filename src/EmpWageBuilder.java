import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    private ArrayList<CompanyEmpWage> companies = new ArrayList<>();

    @Override
    public void addCompany(CompanyEmpWage company) {

        companies.add(company);
    }

    @Override
    public void computeEmployeeWages() {

        for (CompanyEmpWage company : companies) {

            company.computeEmployeeWage();

            System.out.println("----------------------------");
            System.out.println(company);
            System.out.println("----------------------------");
        }
    }

    // Return total wage based on company name
    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companies) {

            if (company.getCompany().equalsIgnoreCase(companyName)) {
                return company.getTotalWage();
            }
        }

        return 0;
    }
}