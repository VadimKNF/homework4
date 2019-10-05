package Lesson8nonaccessmodifiers.L8HW;

public class Lesson8HW {

    static final double pi = 3.14;
    int r;
    double roundSquare(int radius){
        return (pi * radius * radius);
    }

    static double roundLength(int radius){
        return (2 * pi * radius);
    }

    void showInfo(int radius){
        System.out.println("Радиус окружности равен " + radius + "\nПлощадь круга равна " + roundSquare(radius) + "\nДлина окружности равна " + roundLength(radius));
    }

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
        System.out.println("Произведение трех чисел равно " + Lesson8HW.composition(3,4,5));
        System.out.println("Произведение трех чисел равно " + Lesson8HW.composition(2,6,8));
        Lesson8HW.division(5,2);
        Lesson8HW.division(7,3);
        Lesson8HW round = new Lesson8HW();
        round.r = 4;
        System.out.println("Площадь круга с радиусом " + round.r + " равна " + round.roundSquare(round.r));
        System.out.println("Длина окружности с радиусом " + round.r + "равна " + Lesson8HW.roundLength(round.r));
        System.out.println();
        round.showInfo(round.r);
    }
}
