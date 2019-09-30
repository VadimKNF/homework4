package Lesson6;

public class L6HW {

    int sum(){
        return 0;
    }
    int sum(int w){
        return w;
    }
    int sum(int w, int x){
        return w + x;
    }
    int sum(int w, int x, int y){
        return w + x + y;
    }
    int sum(int w, int x, int y, int z){
        return w + x + y + z;
    }
}

class L6HWTest {
    public static void main(String[] args) {
        L6HW s1 = new L6HW();
        System.out.println(s1.sum());
        System.out.println(s1.sum(3, 5));
    }
}
