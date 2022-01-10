package learn.Collection;

import java.util.ArrayList;

public class TestGenerics3 {
    public static void main(String[] args) {
        new TestGenerics3().go();
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
//        编译不通过，因为后续有可能把Cat加到Dog数组中
//        集合的类型检查只发生在编译期间
//        takeAnimals(dogs);
    }
    public void takeAnimals(ArrayList<Animal> animals){
        for (Animal a:animals
        ) {
            a.eat();
        }
        animals.add(new Cat());
    }
}
