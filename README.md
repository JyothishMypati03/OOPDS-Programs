## UC14 - Ability to Get the Total Wage When Queried by Company

### Description

This use case enhances the Employee Wage Computation program by allowing users to retrieve the total employee wage of a specific company. A new method is added to the `EmpWageBuilder` class to search for a company by name and return its total wage.

### Objectives

* Retrieve the total employee wage by company name.
* Search companies using the company name.
* Improve data accessibility and usability.
* Continue using the existing interface and `ArrayList` implementation.
* Support querying company-specific wage information.

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

1. Create a method `getTotalWage(String companyName)` in the `EmpWageBuilder` class.
2. Iterate through the list of `CompanyEmpWage` objects.
3. Compare the given company name with each stored company.
4. If the company is found, return its total employee wage.
5. If the company is not found, return `0`.
6. Call the method from the `main()` method by passing the company name.
7. Display the total employee wage for the requested company.

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
public int getTotalWage(String companyName)
```

### Benefits

* Retrieves employee wage details for a specific company.
* Eliminates the need to manually search through all company records.
* Improves usability and code reusability.
* Maintains object-oriented design using interfaces and `ArrayList`.
* Makes the application easier to extend for future features.

### Sample Output

```text
----------------------------
Company Name : TCS
Daily Wages : [160, 80, 0, 160, 160]
Total Wage  : 1840
----------------------------

----------------------------
Company Name : Infosys
Daily Wages : [200, 100, 0, 200]
Total Wage  : 2950
----------------------------

TCS Total Wage      : 1840
Infosys Total Wage  : 2950
Wipro Total Wage    : 3600
```

**Note:** Output may vary because employee attendance is generated randomly.
