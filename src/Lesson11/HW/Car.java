package Lesson11.HW;

public class Car {
    String color;
    String engine;
    int doorsNum;

    Car(){

    }

    Car(String color, String engine, int doorsNum){
        this.color = color;
        this.engine = engine;
        this.doorsNum = doorsNum;
    }
}

class CarTest {

    //Car c1 = new Car("grey", "l4", 4);
    //Car c2 = new Car("white", "v6", 2);

    public static int changeDoorsNum(int a, Car ct){
        return ct.doorsNum = a;
    }

    public static void swap (Car c1, Car c2){
        Car c3 = new Car();
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("grey", "l4", 4);
        Car c2 = new Car("white", "v6", 2);
        changeDoorsNum(6, c1);
        System.out.println(c1.doorsNum);
        swap(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);

    }

}
