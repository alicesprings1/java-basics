package learn.Static;

import org.junit.Test;

public class AutoBoxingTest {
    Integer i;
    int j;
    public void go(){
//        j=i;
        System.out.println(j);//null
        System.out.println(i);//0
    }
    @Test
    public void test1(){
        go();
    }
}
