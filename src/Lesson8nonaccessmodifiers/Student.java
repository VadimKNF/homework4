package Lesson8nonaccessmodifiers;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Lesson6.Student " + name + " was created\nid " + count);
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 2);
        System.out.println("Количество объектов: " + Student.count);
    }
}
