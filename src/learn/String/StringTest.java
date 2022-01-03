package learn.String;
import org.junit.Test;

public class StringTest {
    /**
     * String的构造方式
     * 1、通过字面量构造
     * 2、new+构造器
     */

    @Test
    public void test2(){
        String s1="javaEE";
        String s2="javaEE";
        String s3=new String("javaEE");
        String s4=new String("javaEE");
        System.out.println(s1 == s2);//true
        System.out.println(s3 == s4);//false
        System.out.println(s1 == s4);//false
        Person p1=new Person("Tom",12);
        Person p2=new Person("Tom",12);
        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true 字面量初始化
    }
    /**
     * 通过字面量的方式声明（区别于new）给一个字符串赋值，此时字符串值声明在字符串常量池中
     * 字符串常量池不会存储相同内容的字符串
     * String的不可变性！！！
     */


    @Test
    public void test1(){
        String s1="abc";//字面量
        String s2="abc";
        System.out.println(s1 == s2);//true 地址值相等
        s1="hello";
        System.out.println(s1);
        System.out.println(s2);

        String s3="abc";
        System.out.println(s3 == s2);
        s3+="def";
        System.out.println(s3);
        System.out.println(s3 == s2);

        String s4="abc";
        String s5=s4.replace("a","m");
        System.out.println(s4);
        System.out.println(s5);
    }
}
