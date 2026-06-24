## UC5 - Calculating Wages for a Month

### Description

This use case calculates the employee wage for a month by considering 20 working days and randomly determining whether the employee is Full Time, Part Time, or Absent each day.

### Assumptions

* Wage Per Hour = 20
* Full Time Hours = 8
* Part Time Hours = 4
* Working Days Per Month = 20

### Employee Types

* Full Time Employee → 8 Hours
* Part Time Employee → 4 Hours
* Absent Employee → 0 Hours

### Algorithm

1. Initialize employee wage parameters.

2. Iterate through 20 working days.

3. Generate a random employee status:

    * `0` → Absent
    * `1` → Full Time
    * `2` → Part Time

4. Determine working hours using a switch-case statement.

5. Calculate daily wage:

   `Daily Wage = Working Hours × Wage Per Hour`

6. Add the daily wage to the monthly wage.

7. Display the total monthly employee wage.

### Wage Calculation

* Full Time Wage = `8 × 20 = 160`
* Part Time Wage = `4 × 20 = 80`
* Absent Wage = `0 × 20 = 0`

### Monthly Wage Formula

`Monthly Wage = Sum of Daily Wages for 20 Working Days`

### Sample Output

```text
Wage : 2320
```

**Note:** The output may vary for each execution because employee attendance is generated randomly.
