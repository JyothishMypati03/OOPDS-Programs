import java.util.*;
public class EmployeeWage {


    public static void  main(String[] args) {
        Random random = new Random();
        int  employeeCheck = random.nextInt(3);

        int wagePerHour = 20 ;
        int partTimeHour = 4;
        int fullDayHour  = 8;

        int employee = 0;

        if(employeeCheck == 1){

            employee = fullDayHour;
            System.out.println("Full time employeee");

        } else if (employeeCheck == 2) {

            employee = partTimeHour;
            System.out.println("Part time employee");

        }else {

            System.out.println("Employee is absent");

        }


        int wage = wagePerHour * employee ;

        System.out.println("Wage :" + wage);











    }
}