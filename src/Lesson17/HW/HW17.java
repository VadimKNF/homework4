package Lesson17.HW;

public class HW17 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("pusya");
        StringBuilder s2 = new StringBuilder("pusya");

        System.out.println(ravenstvo(s1, s2));
    }
    public static boolean ravenstvo(StringBuilder s1, StringBuilder s2){
        return s1.toString().equals(s2.toString());
    }
}
