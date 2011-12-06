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
public class CommissionEmployee extends Employee {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Double commissionRate;
    private Integer grossSales;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public CommissionEmployee(String FirstName, String LastName, long NationalSN, double Rate, int Sales) throws InvalidValue
    {
        super(FirstName,LastName,NationalSN);
        setCommissionRate(Rate);
        setGrossSales(Sales);
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Getters and Setters">
    
    public final double getCommissionRate() {
        return commissionRate;
    }

    public final void setCommissionRate(double commissionRate) throws InvalidValue {
        if (commissionRate>0 && commissionRate<1)
            this.commissionRate = commissionRate;
        else
            throw new InvalidValue("Commission Rate must be within [0..1]");
    }

    public final Integer getGrossSales() {
        return grossSales;
    }

    public final void setGrossSales(Integer grossSales) throws InvalidValue {
        if (grossSales>0)
            this.grossSales = grossSales;
        else
            throw new InvalidValue("Gross Sales cannot be negative");
    }
    
// </editor-fold>

    public @Override Double earning()
    {
        return commissionRate * grossSales;
    }
    
    public @Override String toString()
    {
        String Temp = "Commission Employee "
                    + super.toString()
                    + "\nCommission Rage: " + commissionRate.toString()
                    + "\nGross Sales: " + grossSales.toString();
        return Temp;
    }
    
    public @Override Double getPaymentAmount()
    {
        return earning();
    }
    
}
