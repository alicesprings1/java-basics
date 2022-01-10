package learn.Collection;

import java.util.ArrayList;

public class TestGenerics4 {
    public static void main(String[] args) {
        new TestGenerics4().go();
    }
    public void go(){
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
//      编译通过
        takeAnimals(dogs);
//      不能通过编译！java集合中的引用和对象参数类型必须一致
//      ArrayList<Animal> animals=new ArrayList<Dog>() 不能通过编译
//        animals=dogs;
    }
//    万用字符wildcard，能接受Animal及其子类作为参数类型
//    public <T extends Animal> void takeAnimals(ArrayList<T> animals){} 另一种写法
    public void takeAnimals(ArrayList<? extends Animal> animals){
        for (Animal a:animals
        ) {
            a.eat();
        }

//        编译不通过，声明中带有wildcard时，可以操作集合元素但不能新增集合元素，这样才能保证执行期间的安全性
//        animals.add(new Cat());
    }
}
