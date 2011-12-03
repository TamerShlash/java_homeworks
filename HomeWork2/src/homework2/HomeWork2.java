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
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            CommissionEmployee Test1 = CommissionEmployee.Test();
            BasePlusCommissionEmployee2 Test2 = new BasePlusCommissionEmployee2("First", "Last", (long)55555, 0.25d, 7500);
            BasePlusCommissionEmployee3 Temp = BasePlusCommissionEmployee3.Test2();
        }
        catch (InvalidValue E)
        {
            System.err.println(E.getMessage());
        }
    }
}
