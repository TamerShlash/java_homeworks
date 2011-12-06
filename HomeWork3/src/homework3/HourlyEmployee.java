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
public class HourlyEmployee extends Employee {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer wage;
    private Integer hours;

// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public HourlyEmployee(String FirstName, String LastName, long NationalSN, int Wage, int Hours) throws InvalidValue
    {
        super(FirstName,LastName,NationalSN);
        setWage(Wage);
        setHours(Hours);
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Getters and Setters">
    
    public final Integer getHours() {
        return hours;
    }

    public final void setHours(Integer hours) throws InvalidValue {
        if (hours>0)
            this.hours = hours;
        else
            throw new InvalidValue("Hours cannot be negative");
    }

    public final Integer getWage() {
        return wage;
    }

    public final void setWage(Integer wage) throws InvalidValue {
        if (wage>0)
            this.wage = wage;
        else
            throw new InvalidValue("Wage cannot be negative");
    }

// </editor-fold>
    
    public @Override Double earning()
    {
        return (double)(hours * wage);
    }
    
    public @Override String toString()
    {
        String Temp = "Hourly Employee "
                    + super.toString()
                    + "\nWage: " + wage.toString()
                    + "\nHours: " + hours.toString();
        return Temp;
    }
    
    public @Override Double getPaymentAmount()
    {
        return earning();
    }
    
}
