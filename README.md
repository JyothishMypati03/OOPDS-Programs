## UC8 - Refactor the Code Using Class Variables and Class Method

### Description

This use case refactors the Employee Wage Computation program by replacing local variables with **class variables** and using a **class method** to compute the employee wage. This improves code organization and allows the wage computation logic to be reused throughout the program.

### Objectives

* Improve code readability.
* Improve code maintainability.
* Promote code reusability using a class method.
* Store constant values as class variables.
* Separate business logic from the `main()` method.

### Assumptions

* Wage Per Hour = 20
* Full Time Hours = 8
* Part Time Hours = 4
* Maximum Working Days = 20
* Maximum Working Hours = 100

### Algorithm

1. Declare employee wage constants as class variables.
2. Create a class method named `computeEmployeeWage()`.
3. Initialize variables to track total working days, working hours, and total wage.
4. Generate employee attendance randomly.
5. Determine employee working hours using a `switch-case` statement.
6. Calculate the daily employee wage.
7. Continue calculation until:

    * Working Days reach **20**
    * **OR**
    * Working Hours reach **100**
8. Display:

    * Total Working Days
    * Total Working Hours
    * Total Employee Wage
9. Call the `computeEmployeeWage()` method from the `main()` method.

### Class Variables

```java
static final int WAGE_PER_HOUR = 20;
static final int PART_TIME_HOUR = 4;
static final int FULL_TIME_HOUR = 8;
static final int MAX_WORKING_DAYS = 20;
static final int MAX_WORKING_HOURS = 100;
```

### Class Method

```java
public static void computeEmployeeWage()
```

### Benefits of Refactoring

* Constant values are maintained as class variables.
* Code becomes cleaner and easier to maintain.
* Employee wage computation logic is reusable.
* Reduces duplication and improves program structure.
* Makes future enhancements easier.

### Sample Output

```text
Total Working Days  : 20
Total Working Hours : 100
Total Wage          : 1840
```

**Note:** Output may vary because employee attendance is generated randomly.
