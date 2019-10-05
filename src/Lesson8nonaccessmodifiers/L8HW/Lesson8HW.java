package Lesson8nonaccessmodifiers.L8HW;

public class Lesson8HW {
    static int composition(int a, int b, int c){
        return a * b *c;
    }

    static void division(int d, int e){
        int f = d / e;

        System.out.println("Результат деления a на b равен " + f + ", остаток равен " + d % e);
    }
}

class Lesson8HWTest {
    public static void main(String[] args) {
        System.out.println(Lesson8HW.composition(3,4,5));
        Lesson8HW.division(5,2);
    }
}
