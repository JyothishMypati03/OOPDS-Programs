## UC13 - Store the Daily Wage Along with the Total Wage

### Description

This use case enhances the Employee Wage Computation program by storing the daily employee wage along with the total wage for each company. Daily wages are maintained using an `ArrayList`, allowing the application to keep track of wages earned on each working day.

### Objectives

* Store the daily employee wage for each working day.
* Store the total employee wage for each company.
* Use an `ArrayList` to maintain daily wages.
* Improve record keeping and wage tracking.
* Continue managing multiple companies using the existing object-oriented design.

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
2. Create an `ArrayList<Integer>` to store the daily wages.
3. Generate employee attendance randomly.
4. Determine employee working hours using a switch-case statement.
5. Calculate the daily employee wage.
6. Store each day's wage in the `ArrayList`.
7. Add the daily wage to the total wage.
8. Continue wage computation until:

    * Maximum Working Days are reached
    * **OR**
    * Maximum Working Hours are reached
9. Display the company name, daily wages, and total wage.

### Classes Used

```java
IEmpWageBuilder
CompanyEmpWage
EmpWageBuilder
EmployeeWage
```

### Important Methods

```java
public void computeEmployeeWage()

public void computeEmployeeWages()
```

### Benefits

* Stores both daily wages and total wage.
* Makes employee wage records easier to track.
* Uses `ArrayList` for flexible storage of daily wages.
* Improves maintainability and scalability.
* Continues to follow object-oriented programming principles.

### Sample Output

```text
-------------------------------
Company Name : TCS
Daily Wages : [160, 80, 0, 160, 80, 160]
Total Wage  : 1840
-------------------------------

-------------------------------
Company Name : Infosys
Daily Wages : [200, 100, 0, 200, 200, 100]
Total Wage  : 2950
-------------------------------
```

**Note:** Output may vary because employee attendance is generated randomly.
