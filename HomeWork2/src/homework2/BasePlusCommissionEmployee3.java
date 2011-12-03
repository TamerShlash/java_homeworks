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
public class BasePlusCommissionEmployee3 extends CommissionEmployee2 {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    protected Integer basicSalary;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Setters and Getters">
    
    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) throws InvalidValue {
        if (basicSalary>0)
            this.basicSalary = basicSalary;
        else
            throw new InvalidValue("Salary cannot be a negative value");
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public BasePlusCommissionEmployee3(String FirstName, String LastName, Long NSN, Double Rate, int Salary) throws InvalidValue {
        super(FirstName, LastName, NSN, Rate);
        setBasicSalary(Salary);
    }    
    
// </editor-fold>
    
    public @Override Double earning()
    {
        return basicSalary + super.earning();
    }
    
    public @Override String toString()
    {
        String Temp = "BasePlusCommissionEmployee: ";
        Temp += firstName + " " + lastName;
        Temp += "\nNationalSN: " + nationalSecurityNumber.toString();
        Temp += "\nBasci Salary: " + basicSalary.toString();
        Temp += "\nCommission Rate: " + commissionRate.toString();
        Temp += ", Gross Sales: " + grossSales.toString();
        return Temp;
    }
    
    public static BasePlusCommissionEmployee3 Test2() throws InvalidValue
    {
        BasePlusCommissionEmployee3 Temp = new BasePlusCommissionEmployee3("First", "Last", (long)5555, 0.25,7500);
        System.out.println(Temp.getFirstName());
        System.out.println(Temp.getLastName());
        System.out.println(Temp.getNationalSecurityNumber().toString());
        System.out.println(Temp.getCommissionRate().toString());
        System.out.println(Temp.getGrossSales().toString());
        System.out.println(Temp.toString());
        return Temp;
    }
    
}
