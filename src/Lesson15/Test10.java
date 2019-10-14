package Lesson15;

public class Test10 {
    public static void main(String[] args) {
        for (int h = 0; h < 24; h++){
            int m = 0;
            while(m < 60){
                System.out.printf("%d:%d\n", h, m);
                m++;
            }
        }
    }
}
