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
public class BasePlusCommissionEmployee {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private String firstName;
    private String lastName;
    private Long nationalSecurityNumber;
    private Double commissionRate;
    private Integer grossSales;
    private Integer basicSalary;

// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public BasePlusCommissionEmployee(String FirstName, String LastName, Long NSN, Double Rate, int Salary) throws InvalidValue
    {
        firstName = FirstName;
        lastName = LastName;
        nationalSecurityNumber = NSN;
        grossSales = 0;
        commissionRate = 0.0d;
        basicSalary = Salary;
        setCommissionRate(Rate);
        setBasicSalary(Salary);
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

    public Integer getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Integer basicSalary) throws InvalidValue {
        if (basicSalary>0)
            this.basicSalary = basicSalary;
        else
            throw new InvalidValue("Salary cannot be a negative value");
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
        return basicSalary + (commissionRate * grossSales);
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
    
    public static BasePlusCommissionEmployee Test() throws InvalidValue
    {
        BasePlusCommissionEmployee Temp = new BasePlusCommissionEmployee("First", "Last", (long)5555, 0.25,7500);
        System.out.println(Temp.getFirstName());
        System.out.println(Temp.getLastName());
        System.out.println(Temp.getNationalSecurityNumber().toString());
        System.out.println(Temp.getCommissionRate().toString());
        System.out.println(Temp.getGrossSales().toString());
        System.out.println(Temp.toString());
        return Temp;
    }

}
