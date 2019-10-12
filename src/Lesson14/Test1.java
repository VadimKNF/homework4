package Lesson14;

public class Test1 {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for(i = 0, j = 1, k = 2; k < 11; k++, abc("pizdec suka blyat")){
            System.out.println(i + j + k);
        }

    }
    static void abc(String n){
        System.out.println(n);
    }
}
