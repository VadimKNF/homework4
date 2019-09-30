package Lesson5;

import java.sql.SQLOutput;

public class Car2 {
    Car2(String color1, String engine1, int speed1){
        color = color1;
        engine = engine1;
        speed = speed1;
    }
    String color;
    String engine;
    int speed;

    int gaz(int acc){
        return speed += acc;
    }

    int tormoz(int acc){
        return speed -= acc;
    }

    void showInfo(){
        System.out.println("color: " + color + "\n" + "engine: " + engine + "\n" + "speed: " + speed);
    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2("red", "v6", 60);
        System.out.println("speed of the first car is " + c1.speed);
    }
}
