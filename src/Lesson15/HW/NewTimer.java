package Lesson15.HW;

public class NewTimer {
    public static void main(String[] args) {
        int h = 0;

        while(h < 24){

            int m = 0;
            do {

                int s = 0;
                while (s < 60){
                    System.out.printf("%d:%d:%d\n", h, m, s);
                    s++;

                }
                m++;
            }while (m < 60);
            h++;
        }
    }

}
