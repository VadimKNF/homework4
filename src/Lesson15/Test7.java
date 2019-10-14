package Lesson15;

public class Test7 {
    public static void main(String[] args) {

        int money = 100;

        do {
            System.out.println("stavka");
            System.out.println("you lost");
            money -= 10;
        }
        while(money > 50);
    }
}
