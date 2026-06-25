## UC9 - Ability to Save the Total Wage for Each Company

### Description

This use case extends the Employee Wage Computation program by introducing instance variables. A separate `EmpWageBuilder` object is created for each company to store company-specific details and compute the total employee wage.

### Objectives

* Save the total employee wage for each company.
* Use instance variables instead of function parameters.
* Create a separate `EmpWageBuilder` object for each company.
* Improve code organization using object-oriented programming concepts.
* Make the program easier to maintain and extend.

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
2. Create an `EmpWageBuilder` class with instance variables.
3. Initialize company details using a constructor.
4. Create a `computeEmployeeWage()` method to calculate the total employee wage.
5. Generate employee attendance randomly.
6. Determine employee working hours using a switch-case statement.
7. Continue wage calculation until:

    * Maximum Working Days are reached
    * **OR**
    * Maximum Working Hours are reached
8. Store and display the total employee wage for each company.
9. Repeat the process by creating separate `EmpWageBuilder` objects for different companies.

### Classes Used

```java
CompanyEmpWage
EmpWageBuilder
EmployeeWage
```

### Class Method

```java
public void computeEmployeeWage();
```

### Benefits

* Uses object-oriented programming concepts.
* Stores company-specific information using instance variables.
* Eliminates the need to pass company details as method parameters.
* Makes the program scalable for multiple companies.
* Improves code readability, maintainability, and reusability.

### Sample Output

```text
------------------------------
Company Name : TCS
Total Wage   : 1840
------------------------------

------------------------------
Company Name : Infosys
Total Wage   : 2925
------------------------------
```

**Note:** Output may vary because employee attendance is generated randomly.
