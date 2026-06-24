import java.util.*;
public class EmployeeWage {


    public static void  main(String[] args) {


        int wagePerHour = 20 ;

        int fullDayHour  = 8;

        int wage = wagePerHour * fullDayHour ;

        Random random = new Random();

        int attendence = random.nextInt(2);

        if( attendence == 1){

            System.out.println("Wage :" + wage);

        }


    }
}