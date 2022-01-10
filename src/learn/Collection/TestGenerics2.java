package learn.Collection;

import java.util.ArrayList;

public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }
    public void go(){
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);
    }
    public void takeAnimals(ArrayList<Animal> animals){
        for (Animal a:animals
        ) {
            a.eat();
        }
    }
}
