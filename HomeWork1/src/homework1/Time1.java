/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author ASUS
 */
public class Time1 {
    
// <editor-fold defaultstate="expanded" desc="Private Data Members">
    
    private Integer hour = 0;
    private Integer minute = 0;
    private Integer second = 0;
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Private Methods">
    
    private String toTwoDigits(Integer value)
    {
        return (value>9? value.toString():'0'+value.toString());
    }
    
// </editor-fold>
    
    
    public boolean setTime(int hour, int minute, int second)
    {
        if ((hour>-1 && hour<24) && (minute>-1 && minute<60) && (second>-1 && second<60))
        {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            return true;
        }
        return false;
    }
    
    public String toUniversalString()
    {
        return toTwoDigits(this.hour) + ':' + toTwoDigits(this.minute) + ':' + toTwoDigits(this.second);
    }
    
    public @Override String toString()
    {
        Integer temp = this.hour%12;
        String Timing = (this.hour/12>0)?"PM":"AM";
        return (toTwoDigits(temp) + ':' + toTwoDigits(minute) + ':' + toTwoDigits(second) + ' ' + Timing);        
    }
    
    public static Time1 Test1(int hour, int minute, int second)
    {
        Time1 temp = new Time1();
        System.out.println("Time before assigning values:");
        System.out.println(temp.toString());
        if (temp.setTime(hour, minute, second)==true)
        {
            System.out.println("Time After assigning:");
            System.out.println(temp.toString());
        }
        else 
            System.err.println("Couldn't assign values, one or more are invalid");
        return temp;
    }    
    
}
