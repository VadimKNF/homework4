package Lesson13.HW;

public class Month {
    int num;
    Month(int num){
        this.num = num;
    }
}

class MonthTest {
    public static void main(String[] args) {
        Month january = new Month(1);
        switch (january.num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 2:
                System.out.println("В этом месяце 28 дней");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            default:
                System.out.println("Некорректный месяц");

        }
    }
}
