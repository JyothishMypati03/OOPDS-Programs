import java.util.*;
public class EmployeeWage {


    public static void  main(String[] args) {
        Random random = new Random();


        int wagePerHour = 20 ;
        int partTimeHour = 4;
        int fullDayHour  = 8;
        int workingDaysPerMonth = 20;


        int wage = 0;

        // Loop through each working day in the month
        for(int i=0; i<workingDaysPerMonth; i++){

            // Generate random attendance status:
            int  employeeCheck = random.nextInt(3);

            int employee = 0;


            // Determine employee working hours based on attendance
            switch(employeeCheck) {

                case 1 -> employee = fullDayHour;

                case 2 -> employee = partTimeHour;

            }
            // Calculate and add daily wage to total monthly wage
            wage = wage + (employee * wagePerHour);
        }


        System.out.println("Wage :" + wage);











    }
}