## UC12 - Refactor to Have a List of Multiple Companies to Manage Employee Wage

### Description

This use case refactors the Employee Wage Computation program by replacing the array of `CompanyEmpWage` objects with an `ArrayList`. The `EmpWageBuilder` class manages multiple companies dynamically using the `ArrayList` collection, making the application more flexible and scalable.

### Objectives

* Manage employee wages for multiple companies using an `ArrayList`.
* Replace the fixed-size array with a dynamic collection.
* Improve scalability and flexibility.
* Continue using the interface-based design.
* Simplify adding and managing companies.

### Assumptions

* Full Time Hours = 8
* Part Time Hours = 4
* Employee attendance is generated randomly.
* Each company has its own:

    * Company Name
    * Wage Per Hour
    * Maximum Working Days
    * Maximum Working Hours

### Algorithm

1. Create a `CompanyEmpWage` class to store company details.
2. Create an `IEmpWageBuilder` interface.
3. Implement the interface in the `EmpWageBuilder` class.
4. Replace the array of `CompanyEmpWage` objects with an `ArrayList<CompanyEmpWage>`.
5. Add company objects to the `ArrayList` using the `addCompany()` method.
6. Iterate through the `ArrayList`.
7. Compute and display the employee wage for each company.
8. Allow companies to be added dynamically without a fixed size.

### Interface

```java
public interface IEmpWageBuilder
```

### Classes Used

```java
IEmpWageBuilder
CompanyEmpWage
EmpWageBuilder
EmployeeWage
```

### Important Methods

```java
public void addCompany(CompanyEmpWage company)

public void computeEmployeeWages()
```

### Benefits

* Uses `ArrayList` for dynamic storage.
* Eliminates the limitations of fixed-size arrays.
* Makes it easy to add any number of companies.
* Improves scalability, flexibility, and maintainability.
* Continues to follow object-oriented programming principles using interfaces.

### Sample Output

```text
--------------------------
Company Name : TCS
Total Wage   : 1840
--------------------------

--------------------------
Company Name : Infosys
Total Wage   : 2925
--------------------------

--------------------------
Company Name : Wipro
Total Wage   : 3600
--------------------------
```

**Note:** Output may vary because employee attendance is generated randomly.
