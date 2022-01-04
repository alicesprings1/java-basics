package learn.String;
import org.junit.Test;

public class StringTest {
    String str=new String("good");
    char[] ch={'t','e','s','t'};
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='b';
    }
    @Test
    public void test4(){
        StringTest ex = new StringTest();
        ex.change(str,ch);
        System.out.println(str);//good String的不可变性！无法原地修改字符串
        System.out.println(ch);//best 数组可变
    }
    /**
     * 常量与常量的拼接结果在常量池，常量池中不会存在相同内容的常量
     * 只要拼接其中有一个是变量，结果就在堆中，相当于new
     * 若拼接的结果调用intern方法，则返回值就在常量池中
     */

    @Test
    public void test3(){
        String s1="javaEE";
        String s2="hadoop";
        String s3="javaEEhadoop";
        String s4="javaEE"+"hadoop";
        String s5=s1+"hadoop";
        String s6="javaEE"+s2;
        String s7=s1+s2;
        System.out.println(s3==s4);//true
        System.out.println(s3==s5);//false
        System.out.println(s3==s6);//false
        System.out.println(s3==s7);//false
        System.out.println(s5==s6);//false
        System.out.println(s5==s7);//false
        String s8=s5.intern();//intern() 去常量池中找对应的字符串返回
        System.out.println(s8==s3);//true
    }
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
     * 对字符串重新赋值会指向新的地址
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
