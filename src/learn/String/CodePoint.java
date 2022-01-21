package learn.String;

import org.junit.Test;

public class CodePoint {
    @Test
    public void test2(){
        String s="abcde";
        char c1=s.charAt(0);
        int c2=s.charAt(0);
        System.out.println(c1+": "+c2);
    }
    @Test
    public void test1(){
        //大部分的Unicode字符使用一个代码单元就可以表示，辅助字符需要一对代码单元表示
        String greeting="hello";
        //代码单元
        int n=greeting.length();// 返回字符串代码单元长度
        System.out.println("number of code units: "+n);//1
        //码点
        int cpCount=greeting.codePointCount(0,greeting.length());
        System.out.println("number of code points: "+cpCount);//1
        //一个数学符号，码点数为1，代码单元个数为2
        String word="\uD835\uDD46";
        System.out.println("word: "+word+" length: "+word.length());//2
        int cpCount2=word.codePointCount(0,word.length());
        System.out.println("number of code points: "+cpCount2);//1
        System.out.println(Integer.toHexString(word.charAt(0))+" "+Integer.toHexString(word.charAt(1)));//输出的是对应位置的代码单元 D835 DD46
        int cp=word.codePointAt(0);
        System.out.println(Integer.toHexString(cp));//输出该数学符号对应的码点（只有一个码点）1D546
    }
}
