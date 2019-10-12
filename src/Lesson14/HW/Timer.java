package Lesson14.HW;

public class Timer {
    public static void main(String[] args) {
        time();
    }
    static void time(){
        int h;
        int m;
        int s;
        for (h = 0; h < 24; h++){
            for (m = 0; m < 60; m++){
                if (h > 1 & m % 10 == 0){
                    break;
                }
                for (s = 0; s < 60; s++){

                    if(s * h > m){
                        continue;
                    }
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
    }
}
