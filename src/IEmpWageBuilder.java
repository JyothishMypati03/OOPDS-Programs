public interface IEmpWageBuilder {

    void addCompany(CompanyEmpWage company);

    void computeEmployeeWages();

    int getTotalWage(String company);
}