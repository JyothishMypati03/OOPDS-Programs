## UC11 - Ability to Manage Employee Wage of Multiple Companies Using Interface Approach

### Description

This use case refactors the Employee Wage Computation program by introducing an interface. The `EmpWageBuilder` class implements the `IEmpWageBuilder` interface to manage employee wages for multiple companies. This improves flexibility, abstraction, and maintainability by separating the implementation from its contract.

### Objectives

* Manage employee wages for multiple companies using an interface.
* Implement abstraction using Java interfaces.
* Improve code flexibility and maintainability.
* Continue managing multiple companies using a single `EmpWageBuilder` object.
* Follow object-oriented programming principles.

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

1. Create an interface named `IEmpWageBuilder`.
2. Declare methods `addCompany()` and `computeEmployeeWages()` in the interface.
3. Implement the interface in the `EmpWageBuilder` class.
4. Create a `CompanyEmpWage` class to store company details.
5. Store multiple company objects in an array.
6. Add companies using the `addCompany()` method.
7. Compute employee wages for all companies using the `computeEmployeeWages()` method.
8. Access the implementation through the interface reference in the `main()` method.

### Interface

```java id="v2eofn"
public interface IEmpWageBuilder
```

### Classes Used

```java id="ryxib9"
IEmpWageBuilder
CompanyEmpWage
EmpWageBuilder
EmployeeWage
```

### Important Methods

```java id="m7frzr"
public void addCompany(CompanyEmpWage company)

public void computeEmployeeWages()
```

### Benefits

* Introduces abstraction using interfaces.
* Promotes loose coupling between interface and implementation.
* Improves code reusability and flexibility.
* Makes the application easier to extend and maintain.
* Follows object-oriented design principles.

### Sample Output

```text id="e3qol6"
-------------------------
Company Name : TCS
Total Wage   : 1840
-------------------------

-------------------------
Company Name : Infosys
Total Wage   : 2925
-------------------------

-------------------------
Company Name : Wipro
Total Wage   : 3600
-------------------------
```

**Note:** Output may vary because employee attendance is generated randomly.
