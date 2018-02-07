package w18comp1008s3feb7;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author JWright
 */

//step 1 - create the class
public class Employee
{
    //step 2-create the instance variables
    private String firstName, lastName, sin;
    private LocalDate dateOfBirth;

//    step 3 - create the constructor
    public Employee(String firstName, String lastName, String sin, LocalDate dateOfBirth)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setSin(sin);
        setDateOfBirth(dateOfBirth);
    }
    
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getSin()
    {
        return sin;
    }

    public void setSin(String sin)
    {
        this.sin = sin;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        
        if (age>=15 && age <=90)
            this.dateOfBirth = dateOfBirth;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years of age");
    }
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
}
