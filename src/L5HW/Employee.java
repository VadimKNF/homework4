package L5HW;

import org.w3c.dom.ls.LSOutput;

public class Employee {
    int id;
    String name;
    String surname;
    int age;
    double salary;
    String department;
    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
        name = "Ololoshka";
    }

    double salaryUpgrade(){
        return salary *= 2;
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Мелкин", 27, 40, "qa");
        System.out.println("Увеличенная зарплата " + e1.surname + "а" + " равна " + e1.salaryUpgrade());
        Employee e2 = new Employee(2, "Белкин", 26, 30, "support");
        System.out.println("Увеличенная зарплата " + e2.surname + "а" + " равна " + e2.salaryUpgrade());
        Employee e3 = new Employee(3, "Ololoev", 14, 0, "pizdec");
        System.out.println(e3.name + " " + e3.surname);
        System.out.println(e1.name + " " + e1.surname);

    }

}
