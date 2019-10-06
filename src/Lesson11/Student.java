package Lesson11;

public class Student {
    String name;
    String surname;
    int course;
    double grade;


    Student(String name, String surname, int course, double grade){
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s1){
        s1.name = "Vasiliy";
    }

    public static void main(String[] args) {
        //Student st1 = new Student("Ivan", "Dragov");
        //Student st2 = new Student("Petr", "Kuznetsov");
        //swap(st1, st2);// swap will work only inside method
        //System.out.println(st1.name);// wont be changed outside method
        //changeName(st2);
        //System.out.println(st2.name);
    }
}

class StudentTest {
    static void firstMethod(Student s1, Student s2){
        if (s1.name.equals(s2.name) && s1.surname.equals(s2.surname) && s1.grade == s2.grade && s1.course == s2.course){
            System.out.println("kek");
        }
        else {
            System.out.println("lol");
        }
    }

    static void secondMethod(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.surname.equals(s2.surname)) {
                if (s1.course == s2.course) {
                    if (s1.grade == s2.grade) {
                        System.out.println("equals");
                    } else {
                        System.out.println("not equal in field grade");
                    }
                } else {
                    System.out.println("not equal in field course");
                }
            } else {
                System.out.println("not equal in field surname");
            }
        } else {
            System.out.println("not equal in field name");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Lexa", "Petyx", 3, 4);
        Student s2 = new Student("Lexa", "Petyx", 3, 4);
        firstMethod(s1, s2);
        secondMethod(s1, s2);
    }
}