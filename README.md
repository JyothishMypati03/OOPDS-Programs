## UC10 - Ability to Manage Employee Wage of Multiple Companies

### Description

This use case enhances the Employee Wage Computation program by managing the employee wages of multiple companies using a single `EmpWageBuilder` object. A `CompanyEmpWage` class is created to store company-specific details, and multiple company objects are maintained in an array.

### Objectives

* Manage employee wages for multiple companies.
* Use a single `EmpWageBuilder` object.
* Store multiple `CompanyEmpWage` objects in an array.
* Improve code organization using object-oriented programming.
* Make the program scalable for adding multiple companies.

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
2. Create an `EmpWageBuilder` class to manage multiple companies.
3. Declare an array of `CompanyEmpWage` objects.
4. Add company objects to the array using the `addCompany()` method.
5. Iterate through the array.
6. Compute the employee wage for each company.
7. Store and display the total wage of every company.
8. Use a single `EmpWageBuilder` object to manage all companies.

### Classes Used

```java
CompanyEmpWage
EmpWageBuilder
EmployeeWage
```

### Important Methods

```java
public void addCompany(CompanyEmpWage company);

public void computeEmployeeWages();
```

### Benefits

* Uses a single object to manage multiple companies.
* Stores company information using an array of objects.
* Improves scalability and maintainability.
* Eliminates duplicate code.
* Makes it easy to add new companies in the future.

### Sample Output

```text
----------------------------
Company Name : TCS
Total Wage   : 1840
----------------------------

----------------------------
Company Name : Infosys
Total Wage   : 2925
----------------------------

----------------------------
Company Name : Wipro
Total Wage   : 3600
----------------------------
```

**Note:** Output may vary because employee attendance is generated randomly.
