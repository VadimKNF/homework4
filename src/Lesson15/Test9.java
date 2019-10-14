package Lesson15;

public class Test9 {
    public static void main(String[] args) {

        int h = 0;
        do {
            int m = 0;

            while (m < 60){
                System.out.printf("%d:%d\n", h, m);
                m++;
            }
            h++;
        }
        while (h < 24);

    }
}
