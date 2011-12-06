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
public class Test {
    public static void test()
        {
            try
            {
                // 1
                SalariedEmployee SalEmp = new SalariedEmployee("Salaried", "Employee", 11111L, 10000);
                HourlyEmployee HouEmp = new HourlyEmployee("Hourly", "Employee", 22222L, 50, 70);
                CommissionEmployee ComEmp = new CommissionEmployee("Commission", "Employee", 33333L, 0.25, 50000);
                BasePlusCommissionEmployee BpcEmp = new BasePlusCommissionEmployee("BPC", "Employee", 44444L, 0.15, 50000, 6500);
                
                // 2
                Employee Emps[] = new Employee[4];
                
                // 3
                Emps[0] = SalEmp;
                Emps[1] = HouEmp;
                Emps[2] = ComEmp;
                Emps[3] = BpcEmp;
                
                // 4
                for (Employee E :Emps)
                    System.out.println(E.toString());
                
                // 5
                for (Employee E: Emps)
                {
                    if (E instanceof SalariedEmployee)
                        ((SalariedEmployee)E).setWeeklySalary(12000);
                    else if (E instanceof HourlyEmployee)
                        ((HourlyEmployee)E).setWage(65);
                    else if (E instanceof BasePlusCommissionEmployee)
                    {
                        ((BasePlusCommissionEmployee)E).setCommissionRate(0.20);
                        ((BasePlusCommissionEmployee)E).setBaseSalary(7500);
                    }
                    else if (E instanceof CommissionEmployee)
                        ((CommissionEmployee)E).setCommissionRate(0.35);
                    
                    System.out.println( "New Earnings of "
                                      + E.getFirstName() + ' '
                                      + E.getLastName() + ' '
                                      + E.earning().toString()
                                      );
                }
                
                //6
                Invoice invoic = new Invoice("Invoice for Test", 12345, 600, 500);
                
                //7
                Payable Pays[] = new Payable[5];
                Pays[0] = SalEmp;
                Pays[1] = HouEmp;
                Pays[2] = ComEmp;
                Pays[3] = BpcEmp;
                Pays[4] = invoic;
                
                for (Payable P: Pays)
                {
                    System.out.println(P.toString());
                    System.out.println("Total Payment: " + P.getPaymentAmount().toString());
                    System.out.println();
                }
            }
            catch(InvalidValue E)
            {
                System.out.println(E.getMessage());
            }
        }
}
