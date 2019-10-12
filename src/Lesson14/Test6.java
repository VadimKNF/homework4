package Lesson14;

public class Test6 {
    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }

    public void time(){
        for(int h = 0; h < 24; h++){
            for (int m = 0; m < 60; m++){
                if (m < 10 & h < 10){
                    System.out.println("0" + h + ":" + "0" + m);
                }
                System.out.println(h + ":" + m);
            }
        }
    }
}
