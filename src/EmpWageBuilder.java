import java.util.*;
import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    // ArrayList to store multiple companies
    private ArrayList<CompanyEmpWage> companies = new ArrayList<>();

    // Add company
    @Override
    public void addCompany(CompanyEmpWage company) {
        companies.add(company);
    }

    // Compute wages for all companies
    @Override
    public void computeEmployeeWages() {

        for (CompanyEmpWage company : companies) {

            company.computeEmployeeWage();

            System.out.println("--------------------------");
            System.out.println(company);
            System.out.println("--------------------------");
        }
    }
}
