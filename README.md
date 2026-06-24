## UC4 - Solving Using Switch Case Statement

### Description

This use case uses a Switch Case Statement to determine whether an employee is Full Time, Part Time, or Absent and calculates the employee wage accordingly.

### Assumptions

* Wage Per Hour = 20
* Full Time Hours = 8
* Part Time Hours = 4

### Employee Types

* Full Time Employee → 8 Hours
* Part Time Employee → 4 Hours
* Absent Employee → 0 Hours

### Algorithm

1. Generate a random value between 0 and 2 using the Random class.

2. Use a switch-case statement to determine employee type.

3. Assign working hours based on employee type.

4. Calculate employee wage using:

   `Employee Wage = Working Hours × Wage Per Hour`

5. Display employee type and wage.

### Wage Calculation

* Full Time Wage = `8 × 20 = 160`
* Part Time Wage = `4 × 20 = 80`
* Absent Wage = `0 × 20 = 0`

### Sample Output

```text
Full time employee
Wage : 160
```

or

```text
Part time employee
Wage : 80
```

or

```text
Employee is absent
Wage : 0
```
