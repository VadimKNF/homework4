package Polymorphysm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal pupsik1 = cat;//upcasting
        Animal pupsik = new Cat(); //upcasting

        Dog dog1 = (Dog) animal;//downcasting  animal converts into dog

        /*Animal a = new Animal();
        Dog d = (Dog) a;
        d.bark();*/


        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal){
        animal.eat();
    }
}
