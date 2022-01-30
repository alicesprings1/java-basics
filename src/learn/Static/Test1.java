package learn.Static;

public class Test1 {
    public static void main(String[] args) {
        Base son1=new Son();
        Son son2=new Son();
        //static方法可以被重新声明，但并没有覆盖父类的方法
        System.out.println(son1.staticBase());
        System.out.println(son1.normal());
        System.out.println(son2.staticBase());
        System.out.println(son2.normal());
    }
}
