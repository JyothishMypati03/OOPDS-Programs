## UC7 - Refactor the Code to Write a Class Method to Compute Employee Wage

### Description

This use case refactors the Employee Wage Computation program by moving the wage calculation logic into a separate class method named `computeEmployeeWage()`.

### Objectives

* Improve code readability.
* Improve code maintainability.
* Reuse employee wage computation logic.
* Separate business logic from the main method.

### Assumptions

* Wage Per Hour = 20
* Full Time Hours = 8
* Part Time Hours = 4
* Maximum Working Days = 20
* Maximum Working Hours = 100

### Algorithm

1. Create a class method named `computeEmployeeWage()`.
2. Initialize employee wage parameters.
3. Generate employee attendance randomly.
4. Determine employee working hours using a switch-case statement.
5. Calculate daily employee wage.
6. Continue calculation until:

    * Working Days reach 20
    * OR Working Hours reach 100
7. Display the total employee wage.
8. Call the method from the `main()` method.

### Class Method

```java
public static void computeEmployeeWage()
```

### Benefits of Refactoring

* Logic is moved out of the `main()` method.
* Code becomes easier to understand.
* Employee wage computation can be reused.
* Program structure becomes cleaner.

### Sample Output

```text
Wage : 1840
```

**Note:** Output may vary because employee attendance is generated randomly.
