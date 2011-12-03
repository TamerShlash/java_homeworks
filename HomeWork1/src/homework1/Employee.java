/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author ASUS
 */
public class Employee {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private String firstName;
    private String lastName;
    private Date birthday;
    private Date hireDate;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    public Employee(String FirstName, String LastName, Date Birth, Date Hire)
    {
        firstName = FirstName;
        lastName = LastName;
        birthday = Birth;
        hireDate = Hire;
    }
    
// </editor-fold>
    
    public @Override String toString()
    {
        String temp = firstName +" " + lastName;
        temp += "\nBirthday: " + birthday.toString();
        temp += ", Hire Date: " + hireDate.toString();
        return temp;
    }
    
    public static Employee Test5()
    {
        Date birthday = new Date(1,2,3);
        Date HireDate = new Date(1,3,5);
        Employee Temp = new Employee("First", "Second", birthday, HireDate);
        return Temp;
    }
}
