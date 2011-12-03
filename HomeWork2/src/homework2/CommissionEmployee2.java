/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 *
 * @author ASUS
 */
public class CommissionEmployee2 {
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    protected String firstName;
    protected String lastName;
    protected Long nationalSecurityNumber;
    protected Double commissionRate;
    protected Integer grossSales;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public CommissionEmployee2(String FirstName, String LastName, Long NSN, Double Rate) throws InvalidValue
    {
        System.out.println("Calling Constructor with Parameters:");
        System.out.print("Frst Name: " + FirstName);
        System.out.println("Last Name: " + LastName);
        System.out.println("National SN: " + NSN.toString());
        System.out.println("Commission Rate: " + Rate.toString());
        
        firstName = FirstName;
        lastName = LastName;
        nationalSecurityNumber = NSN;
        grossSales = 0;
        commissionRate = 0.0d;
        if (Rate>0 && Rate<1)
            commissionRate = Rate;
        else
            throw new InvalidValue("Commision Rate must be in range [0..1]");
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Setters and Getters">

    public Double getCommissionRate() {
        return commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getGrossSales() {
        return grossSales;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getNationalSecurityNumber() {
        return nationalSecurityNumber;
    }

    public void setCommissionRate(Double commissionRate) throws InvalidValue {
        if (commissionRate>0 && commissionRate<1)
            this.commissionRate = commissionRate;
        else
            throw new InvalidValue("Commision Rate must be in range [0..1]");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGrossSales(int grossSales) throws InvalidValue {
        if (grossSales>=0)
            this.grossSales = grossSales;
        else
            throw new InvalidValue("Gross Sales cannot be less than 0");
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationalSecurityNumber(Long nationalSecurityNumber) {
        this.nationalSecurityNumber = nationalSecurityNumber;
    }
    
// </editor-fold>
    
    public Double earning()
    {
        return commissionRate * grossSales;
    }
    
    public @Override String toString()
    {
        String Temp = "CommissionEmployee: ";
        Temp += firstName + " " + lastName;
        Temp += "\nNationalSN: " + nationalSecurityNumber.toString();
        Temp += "\nCommission Rate: " + commissionRate.toString();
        Temp += ", Gross Sales: " + grossSales.toString();
        return Temp;
    }
    
    public static CommissionEmployee Test() throws InvalidValue
    {
        CommissionEmployee Temp = new CommissionEmployee("First", "Last", (long)5555, 0.25);
        System.out.println(Temp.getFirstName());
        System.out.println(Temp.getLastName());
        System.out.println(Temp.getNationalSecurityNumber().toString());
        System.out.println(Temp.getCommissionRate().toString());
        System.out.println(Temp.getGrossSales().toString());
        System.out.println(Temp.toString());
        return Temp;
    }

}
