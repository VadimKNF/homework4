package Lesson8nonaccessmodifiers;

public class Test1 {
    public final int a = 10;

    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.a = t.a * 2; //wont work bc a is constant (non-access modifier final)
        System.out.println(t.a);
    }
}

class Test2 {
    public final int b;
    Test2(){
        b = 2;
    }
    Test2(String s){
        b = 3;
    }

    public void abc(short s){
        final byte b = 10;
        System.out.println(s + b);
    }
}
