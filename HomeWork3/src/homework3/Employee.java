/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

/**
 *
 * @author ASUS
 */
public abstract class Employee implements Payable {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private String firstName;
    private String lastName;
    private Long NSN;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">

    public Employee(String FirstName, String LastName, long NationalSN)
    {
        firstName = FirstName;
        lastName = LastName;
        NSN = NationalSN;
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Getters and Setters">
    
    public final Long getNSN() {
        return NSN;
    }

    public final void setNSN(Long NSN) {
        this.NSN = NSN;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
// </editor-fold>
    
    public abstract Double earning();
    
    public @Override String toString()
    {
        String Temp = firstName + ' ' + lastName
                    + "\nNational SN: " + NSN.toString();
        return Temp;
    }
    
}
