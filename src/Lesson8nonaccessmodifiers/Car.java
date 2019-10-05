package Lesson8nonaccessmodifiers;

public class Car {
    String color = "blue";
    String engine = "v6";
}

class Human{
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        /*h1.c = new Car();  //wont work bc Car is final
        h1.c = new Car();*/
        h1.c.engine = "v8";
    }
}
