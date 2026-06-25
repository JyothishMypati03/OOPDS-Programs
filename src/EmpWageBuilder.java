import java.util.*;
public class EmpWageBuilder implements IEmpWageBuilder {

    // Array of companies
    private CompanyEmpWage[] companies;

    // Company count
    private int companyCount = 0;

    // Constructor
    public EmpWageBuilder(int size) {
        companies = new CompanyEmpWage[size];
    }

    // Add company
    @Override
    public void addCompany(CompanyEmpWage company) {

        companies[companyCount] = company;
        companyCount++;
    }

    // Compute wages
    @Override
    public void computeEmployeeWages() {

        for (int i = 0; i < companyCount; i++) {

            companies[i].computeEmployeeWage();

            System.out.println("-------------------------");
            System.out.println(companies[i]);
            System.out.println("-------------------------");
        }
    }
}
