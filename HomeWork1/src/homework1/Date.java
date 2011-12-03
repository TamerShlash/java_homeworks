/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author ASUS
 */
public class Date {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer year = 1980;
    private Integer month = 1;
    private Integer day = 1;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Checker Functions">
    
    public final void checkDay()
    {
        if (day<1)
        {
            day = 1;
            return;
        }
        switch (month)
        {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                if (day>31)
                    day = 1;
                break;
            case 4: case 6: case 9: case 11:
                if (day>30)
                    day = 1;
                break;
            case 2:
                if (day>28)
                    day = 1;
                break;
        }
    }
    
    public final void checkMonth()
    {
        if (month>0 && month<13)
            return;
        else
            month = 1;
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        checkDay();
        checkMonth();
    }
    
// </editor-fold>
    
    public @Override String toString()
    {
        return day.toString() + '/' + month.toString() + '/' + year.toString();
    }
    
}
