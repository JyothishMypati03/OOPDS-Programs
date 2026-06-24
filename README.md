## UC3 - Add Part Time Employee & Wage

### Description

This use case adds support for both Full Time and Part Time employees and calculates employee wage based on working hours.

### Assumptions

* Wage Per Hour = 20
* Full Time Hours = 8
* Part Time Hours = 4

### Employee Types

| Employee Type | Working Hours |
| ------------- | ------------- |
| Full Time     | 8             |
| Part Time     | 4             |
| Absent        | 0             |

### Algorithm

1. Generate a random value between 0 and 2.

2. If the value is:

    * `0` → Employee is Absent
    * `1` → Employee is Full Time
    * `2` → Employee is Part Time

3. Calculate employee wage using:

   `Wage = Working Hours × Wage Per Hour`

4. Display employee type and wage.

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
