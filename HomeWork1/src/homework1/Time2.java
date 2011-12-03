/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 *
 * @author ASUS
 */
public class Time2 {
    
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
    
// <editor-fold defaultstate="expanded" desc="Constructors">
    
    public Time2()
    {    }
    
    public Time2(int hour) throws InvalidValue
    {
        this();
        if (hour>-1 && hour<24)
            this.hour = hour;
        else
            throw new InvalidValue("Illegal hour, must be within\"0..23\".");
    }
    
    public Time2(int hour, int minute) throws InvalidValue
    {
        this(hour);
        if (minute>-1 && minute<60)
            this.minute = minute;
        else
            throw new InvalidValue("Illegal Minute, must be within\"0..59\".");
    }
    
    public Time2(int hour, int minute, int second) throws InvalidValue
    {
        this(hour, minute);
        if (second>-1 && second<60)
            this.second = second;
        else
            throw new InvalidValue("Illegal Second, must be within\"0..59\".");
    }
    
    public Time2(Time2 CopiedTime) throws InvalidValue
    {
        this(CopiedTime.hour,CopiedTime.minute,CopiedTime.second);
    }
    
// </editor-fold>
    
// <editor-fold defaultstate="expanded" desc="Setters and Getters">

    public Integer getHour() {
        return hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setHour(Integer hour) throws InvalidValue
    {
        if (hour>-1 && hour<24)
            this.hour = hour;
        else
            throw new InvalidValue("Illegal hour, must be within\"0..23\".");
    }

    public void setMinute(Integer minute) throws InvalidValue
    {
        if (minute>-1 && minute<60)
            this.minute = minute;
        else
            throw new InvalidValue("Illegal Minute, must be within\"0..59\".");
    }

    public void setSecond(Integer second) throws InvalidValue
    {
        if (second>-1 && minute<60)
            this.second = second;
        else
            throw new InvalidValue("Illegal Second, must be within\"0..59\".");
    }
    
// </editor-fold>
    
    public void setTime(int hour, int minute, int second) throws InvalidValue
    {
        if ((hour>-1 && hour<24) && (minute>-1 && minute<60) && (second>-1 && second<60))
        {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else
            throw new InvalidValue("Hour must be within\"0..23\", Minute must be within\"0..59\", Second must be within\"0..59\".");
    }
    
    public String toUniversalString()
    {
        return toTwoDigits(this.getHour()) + ':' + toTwoDigits(this.getMinute()) + ':' + toTwoDigits(this.getSecond());
    }
    
    public @Override String toString()
    {
        Integer temp = this.getHour()%12;
        String Timing = (this.getHour()/12>0)?"PM":"AM";
        return (toTwoDigits(temp) + ':' + toTwoDigits(this.getMinute()) + ':' + toTwoDigits(this.getSecond()) + ' ' + Timing);        
    }
    
    public static Time2 Test1(int hour, int minute, int second)
    {
        Time2 temp = new Time2();
        System.out.println("Time before assigning values:");
        System.out.println(temp.toString());
        try
        {
            temp.setTime(hour, minute, second);
            System.out.println("Time After assigning:");
            System.out.println(temp.toString());
        }
        catch(InvalidValue E)
        {
            System.err.println("Couldn't assign values Due to the following error(s):");
            System.err.println(E.getMessage());
        }
        finally
        {
            return temp;
        }
    }
    
    public static Time2[] Test2() throws InvalidValue
    {
        Time2[] Arr = new Time2[5];
        try
        {
            Arr[0] = new Time2();
            Arr[1] = new Time2(0);
            Arr[2] = new Time2(0,0);
            Arr[3] = new Time2(0,0,0);
            Arr[4] = new Time2(Arr[0]);
        }
        catch (InvalidValue E)
        {
            System.err.println(E.getMessage());
        }
        finally
        {
            return Arr;
        }
    }
    
}
