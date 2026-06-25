## UC8 - Compute Employee Wage for Multiple Companies

### Description

This use case extends the Employee Wage Computation program to calculate wages for multiple companies. Each company has its own wage per hour, maximum working days, and maximum working hours. The employee wage is computed using a class method with function parameters instead of class variables.

### Objectives

* Compute employee wages for multiple companies.
* Use function parameters instead of class variables.
* Improve code reusability.
* Reduce code duplication.
* Make the program flexible for different company requirements.

### Assumptions

* Full Time Hours = 8
* Part Time Hours = 4
* Employee attendance is generated randomly.
* Each company has its own:

    * Wage Per Hour
    * Maximum Working Days
    * Maximum Working Hours

### Algorithm

1. Create a class method named `computeEmployeeWage()`.
2. Pass the company name, wage per hour, maximum working days, and maximum working hours as function parameters.
3. Generate employee attendance randomly.
4. Determine employee working hours using a switch-case statement.
5. Calculate the daily employee wage.
6. Continue wage calculation until:

    * Maximum Working Days are reached
    * **OR**
    * Maximum Working Hours are reached
7. Display the employee wage details for the company.
8. Repeat the process for multiple companies by calling the method with different parameter values.

### Class Method

```java
public static void computeEmployeeWage(String company,
                                       int wagePerHour,
                                       int maxWorkingDays,
                                       int maxWorkingHours)
```

### Benefits

* Supports multiple companies with different wage policies.
* Eliminates hard-coded company values.
* Improves code reusability and flexibility.
* Makes the program easier to maintain and extend.

### Sample Output

```text
--------------------------------
Company Name        : TCS
Wage Per Hour       : 20
Working Days        : 20
Working Hours       : 100
Total Employee Wage : 2000
--------------------------------

--------------------------------
Company Name        : Infosys
Wage Per Hour       : 25
Working Days        : 22
Working Hours       : 120
Total Employee Wage : 3000
--------------------------------
```

**Note:** Output may vary because employee attendance is generated randomly.
