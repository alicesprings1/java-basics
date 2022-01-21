package learn.String;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringMethodTest {
/*
* */
    @Test
    public void translate(){
        String str="test测试字符集转换";
        String tempStr="";
        byte[] b=str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(b));
        try {
            //String按指定格式编码，需要在构造函数中传入byte[]并指定编码格式
            tempStr=new String(b,"GBK");
            tempStr=tempStr.trim();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(tempStr.getBytes()));
        System.out.println(tempStr);//输出乱码
    }
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
