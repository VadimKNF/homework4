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



    int changeDoorsNum(int a, Car ct){
        return ct.doorsNum = a;
    }

    void swap (Car c1, Car c2){

        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("grey", "l4", 4);
        Car c2 = new Car("white", "v6", 2);
        ct.changeDoorsNum(6, c1);
        System.out.println(c1.doorsNum);
        ct.swap(c1, c2);
        System.out.println(c1.color);
        System.out.println(c2.color);

    }

}
