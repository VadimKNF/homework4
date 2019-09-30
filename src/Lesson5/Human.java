package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info(){
        System.out.println("name: " + name + "\n" + "car color: " + car.color + "\n" + "balance: " + bA.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "v6");
        h.bA = new BankAccount(18, 200);

        h.bA.snyatieSoScheta(100);
        h.info();
        h.bA.popolnenieScheta(250);
        h.info();
    }
}

class Car3{
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

    double popolnenieScheta(double x){
        return balance += x;
    }

    double snyatieSoScheta(double y){
        return balance -= y;
    }
}