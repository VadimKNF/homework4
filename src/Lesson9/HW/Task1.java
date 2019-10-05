package Lesson9.HW;

public class Task1 {
    public static void objCreator() {
        Task1 a = new Task1();
        Task1 b = new Task1();
    }
}
class Task1Test{
    public static void main(String[] args) {
        Task1 c = new Task1();
        Task1.objCreator();
        Task1.objCreator();
        Task1 d = new Task1();
        Task1.objCreator();
    }


}