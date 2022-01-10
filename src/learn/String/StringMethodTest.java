package learn.String;

import org.junit.Test;

import java.util.Locale;

public class StringMethodTest {
/*
* */
    @Test
    public void test1(){
        String s1="HelloWord";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        String s2=s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);

    }
}
