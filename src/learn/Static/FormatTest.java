package learn.Static;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import static java.lang.Math.*;

public class FormatTest {
    @Test
    public void test4(){
        //static import
        System.out.println(sqrt(2));// Math.sqrt(2)
    }

    @Test
    public void test3(){
        Calendar c = Calendar.getInstance();
        c.set(2022,1,4,19,11,20);
        long day1=c.getTimeInMillis();
        day1+=1000*60*60;// plus an hour
        c.setTimeInMillis(day1);
        System.out.println("new hour "+c.get(c.HOUR_OF_DAY));
        c.add(c.DATE,35);
        System.out.println("add 35 days "+c.getTime());
        c.roll(c.DATE,35);
        System.out.println("roll 35 days "+c.getTime());// only day changes
        c.set(c.DATE,1);
        System.out.println("set to 1 "+c.getTime());
    }

    @Test
    public void test2(){
        System.out.println(String.format("%tc",new Date()));//complete time
        System.out.println(String.format("%tr",new Date()));//hour minute second
        Date today=new Date();
        System.out.println(String.format("%tA, %tB %td",today,today,today));// week month day
        System.out.println(String.format("%tA, %<tB %<td",today));// < means reuse parameter
    }

    @Test
    public void test1(){
        System.out.println(String.format("I have %,.2f bugs to fix",123456.789));//I have 123,456.79 bugs to fix
        System.out.println(String.format("%,6.1f",42.000));
    }
}
