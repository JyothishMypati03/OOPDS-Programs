# Employee Wage Computation

## Project Description

This project is a Java-based Employee Wage Computation program developed using Git branching workflow.  
It demonstrates employee attendance checking, daily wage calculation, part-time wage calculation, switch-case usage, monthly wage calculation, wage computation until a condition is reached, and refactoring using a class method.

## Features Implemented

### UC1 - Check Employee Attendance
- Employee attendance is checked using the Random class.
- Output shows whether the employee is present or absent.

### UC2 - Calculate Daily Employee Wage
- Wage per hour is 20.
- Full day working hours are 8.
- Daily wage is calculated as:
    - Wage = Wage Per Hour × Full Day Hours

### UC3 - Add Part Time Employee & Wage
- Part-time employee support is added.
- Full-time hours = 8
- Part-time hours = 4
- Wage is calculated based on employee type.

### UC4 - Solving Using Switch Case Statement
- The if-else logic is replaced with a switch-case statement.
- Employee type is determined using switch-case.

### UC5 - Calculating Wages for a Month
- Employee wage is calculated for 20 working days.
- Attendance is checked randomly for each day.
- Total monthly wage is calculated.

### UC6 - Calculate Wages Till a Condition of Total Working Hours or Days is Reached
- Maximum working days = 20
- Maximum working hours = 100
- Wage calculation stops when either condition is reached.

### UC7 - Refactor the Code to Write a Class Method to Compute Employee Wage
- Wage calculation logic is moved into a class method.
- Code is refactored for better readability and reusability.

## Assumptions

- Wage Per Hour = 20
- Full Time Hours = 8
- Part Time Hours = 4
- Maximum Working Days = 20
- Maximum Working Hours = 100

## Output

The output varies because employee attendance is generated randomly.

## Branch Structure

```text
main
└── dev
    ├── feature/UC1-Attendance
    ├── feature/UC2-DailyWage
    ├── feature/UC3-PartTimeWage
    ├── feature/UC4-SwitchCase
    ├── feature/UC5-MonthlyWage
    ├── feature/UC6-MaxHoursAndDays
    └── feature/UC7-RefactorClassMethod