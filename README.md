## UC6 - Calculate Wages Till a Condition of Total Working Hours or Days is Reached

### Description

This use case calculates employee wages until either the maximum working days or maximum working hours for a month is reached.

### Assumptions

* Wage Per Hour = 20
* Full Time Hours = 8
* Part Time Hours = 4
* Maximum Working Days = 20
* Maximum Working Hours = 100

### Employee Types

* Full Time Employee → 8 Hours
* Part Time Employee → 4 Hours
* Absent Employee → 0 Hours

### Algorithm

1. Initialize employee wage parameters.
2. Initialize total working days, total working hours, and total wage.
3. Continue wage calculation while:

    * Working Days < 20
    * Working Hours < 100
4. Generate employee attendance randomly.
5. Determine working hours using a switch-case statement.
6. Add daily working hours to total working hours.
7. Calculate daily wage and add it to total wage.
8. Stop when either condition is reached.
9. Display the total employee wage.

### Wage Calculation

* Full Time Wage = `8 × 20 = 160`
* Part Time Wage = `4 × 20 = 80`
* Absent Wage = `0 × 20 = 0`

### Stopping Condition

The program stops when:

* Total Working Days reaches **20**
  **OR**
* Total Working Hours reaches **100**

### Sample Output

```text
Wage : 1840
```

**Note:** The output may vary for each execution because employee attendance is generated randomly.
