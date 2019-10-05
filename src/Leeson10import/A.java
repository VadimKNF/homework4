package Leeson10import;
import Lesson9.*;
import Lesson8nonaccessmodifiers.*;

public class A {
    public static void main(String[] args) {
        Lesson9.Car c1 = new Lesson9.Car("red", "v6");
        Lesson8nonaccessmodifiers.Student st1 = new Lesson8nonaccessmodifiers.Student("Victor", 4);
    }
}

class Atest {
    public static void main(String[] args) {
        A a1 = new A();
    }
}

