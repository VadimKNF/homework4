package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ////java5////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        ////generics////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("frog");
        String animal1 = animals1.get(1);

        ////java7+////
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {

}