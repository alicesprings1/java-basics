package learn.String;


import org.junit.Test;

public class StringBufferBuilderTest {
/*
 * String StringBuffer StringBuilder异同
 * 1、String 不可变字符序列 底层使用char[]
 * 2、StringBuffer 可变，线程安全，效率偏低 底层使用char[]
 * 3、StringBuilder 可变，线程不安全，效率高 JDK5新增 底层使用char[]
 */
    @Test
    public void test1(){
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);
    }
}
