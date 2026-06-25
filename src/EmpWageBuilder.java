import java.util.*;
public class EmpWageBuilder {

    // Array to store multiple companies
    private CompanyEmpWage[] companies;

    // Variable to track number of companies
    private int companyCount = 0;

    // Constructor
    public EmpWageBuilder(int size) {
        companies = new CompanyEmpWage[size];
    }

    // Method to add company
    public void addCompany(CompanyEmpWage company) {

        companies[companyCount] = company;
        companyCount++;
    }

    // Method to compute wage for all companies
    public void computeEmployeeWages() {

        for (int i = 0; i < companyCount; i++) {

            companies[i].computeEmployeeWage();

            System.out.println("----------------------------");
            System.out.println(companies[i]);
            System.out.println("----------------------------");
        }
    }
}
