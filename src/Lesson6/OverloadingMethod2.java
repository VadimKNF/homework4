package Lesson6;

public class OverloadingMethod2 {
    int sum(int i1, int i2){
        return i1 + i2;
    }

    String sum(String s1, String s2){
        return s1 + s2;
    }
}

class OverloadingMethod2Test{
    public static void main(String[] args) {
        OverloadingMethod2 m2 = new OverloadingMethod2();
        int a = 2;
        int b = 3;
        String s1 = "privet";
        String s2 = "mambet";
        System.out.println(m2.sum(a, b));
        System.out.println(m2.sum(s1, s2));
    }
}
