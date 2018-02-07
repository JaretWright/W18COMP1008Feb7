package w18comp1008s3feb7;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Feb7
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Fred","Flintstone","123 456 789", 
                                    LocalDate.of(1978, Month.MARCH, 10));
        System.out.printf("Emp1 name = %s%n", emp1.getFirstName());
        System.out.printf("emp1: %s%n",emp1.toString());
    }
    
    
}
