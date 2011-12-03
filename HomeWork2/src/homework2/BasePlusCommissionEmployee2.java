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
public class BasePlusCommissionEmployee2 extends CommissionEmployee {

// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer basicSalary;
    
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
    
    public BasePlusCommissionEmployee2(String FirstName, String LastName, Long NSN, Double Rate, int Salary) throws InvalidValue {
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
        String Temp = "BasePlusCommissionEmployee2: ";
        Temp += getFirstName() + " " + getLastName();
        Temp += "\nNationalSN: " + getNationalSecurityNumber().toString();
        Temp += "\nBasci Salary: " + getBasicSalary().toString();
        Temp += "\nCommission Rate: " + getCommissionRate().toString();
        Temp += ", Gross Sales: " + getGrossSales().toString();
        return Temp;
    }
    
    public static BasePlusCommissionEmployee2 Test() throws InvalidValue
    {
        BasePlusCommissionEmployee2 Temp = new BasePlusCommissionEmployee2("First", "Last", (long)5555, 0.25,7500);
        System.out.println(Temp.getFirstName());
        System.out.println(Temp.getLastName());
        System.out.println(Temp.getNationalSecurityNumber().toString());
        System.out.println(Temp.getCommissionRate().toString());
        System.out.println(Temp.getGrossSales().toString());
        System.out.println(Temp.toString());
        return Temp;
    }
}
