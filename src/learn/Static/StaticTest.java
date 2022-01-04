package learn.Static;
import org.junit.Test;

public class StaticTest {
    static int a;
    static final int b=12;
    int c=1;

    public void go1(final int x){
        System.out.println(x);
    }

    public static void go2(final int x){
        System.out.println(x);
    }

    @Test
    public void test1(){
        System.out.println(a);
    }

    @Test
    public void test2(){
//        System.out.println(b);
        go1(b);
    }

    @Test
    public void test3(){
        go2(c);
    }
}
