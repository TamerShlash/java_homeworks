/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 *
 * @author ASUS
 */
public class SalariedEmployee extends Employee {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer weeklySalary;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public SalariedEmployee(String FirstName, String LastName, long NationalSN, int Salary) throws InvalidValue
    {
        super(FirstName,LastName,NationalSN);
        setWeeklySalary(Salary);
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Getters and Setters">
    
    public final Integer getWeeklySalary() {
        return weeklySalary;
    }

    public final void setWeeklySalary(Integer weeklySalary) throws InvalidValue {
        if (weeklySalary>0)
            this.weeklySalary = weeklySalary;
        else
            throw new InvalidValue("Weekly Salary cannot be negative");
    }
    
// </editor-fold>

    public @Override Double earning()
    {
        return (double)weeklySalary;
    }
    
    public @Override String toString()
    {
        String Temp = "Salaried Employee "
                    + super.toString()
                    + "\nWeekly Salary: " + weeklySalary.toString();
        return Temp;
    }
    
    public @Override Double getPaymentAmount()
    {
        return earning();
    }
    
}
