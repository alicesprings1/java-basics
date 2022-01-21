package learn.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }
    public void go(){
        Animal[] animals={new Dog(),new Cat(),new Dog()};
        Dog[] dogs={new Dog(),new Dog(),new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }
    public void takeAnimals(Animal[] animals){
        for (Animal a:animals
             ) {
            a.eat();
        }
//        运行时出错，数组的类型在运行期间检查，不能把Cat对象加入Dog数组中
        animals[0]=new Cat();
    }
}
