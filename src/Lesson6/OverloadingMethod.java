package Lesson6;

public class OverloadingMethod {
    void show(int i1){
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }
    void show(String s1, int a1){
        System.out.println(s1 + " " + a1);
    }
    void show(int a1, String s1){
        System.out.println(a1 + " " + s1);
    }
}

class OverloadingMethodTest{
    public static void main(String[] args) {
        OverloadingMethod m1 = new OverloadingMethod();
        int a = 11;
        boolean b = true;
        String s = "test";
        m1.show(a, s);
    }
}