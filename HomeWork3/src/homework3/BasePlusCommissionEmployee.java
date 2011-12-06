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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer baseSalary;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public BasePlusCommissionEmployee(String FirstName, String LastName, long NationalSN, double Rate, int Sales, int Salary) throws InvalidValue
    {
        super(FirstName,LastName,NationalSN,Rate,Sales);
        setBaseSalary(Salary);
    }
    
// </editor-fold>

// <editor-fold defaultstate="expanded" desc="Getters and Setters">
    
    public final Integer getBaseSalary() {
        return baseSalary;
    }

    public final void setBaseSalary(Integer baseSalary) throws InvalidValue {
        if (baseSalary>0)
            this.baseSalary = baseSalary;
        else
            throw new InvalidValue("Base salary cannot be negative");
    }
    
// </editor-fold>
    
    public @Override Double earning()
    {
        return baseSalary + super.earning();
    }
    
    public @Override String toString()
    {
        String Temp = "Base Plus "
                    + super.toString()
                    + "\nSalary: " + baseSalary.toString();
        return Temp;
    }
    
    public @Override Double getPaymentAmount()
    {
        return earning();
    }
    
}
