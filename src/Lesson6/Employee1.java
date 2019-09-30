package Lesson6;

public class Employee1 {

    Employee1(String surname3, int age3){
        this(0, surname3, age3, 0.0, null);
    }

    public Employee1(int id2, String surname2, int age2){
        this(id2, surname2, age2, 0.0, null);
    }

    Employee1(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    protected int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void showId(){
        System.out.println(id);
    }
    public void showSurname(){
        System.out.println(surname);
    }
    public void showSalary(){
        System.out.println(salary);
    }
    private Eployee1(int age1, String department1){
        age = age1;
        department = department1;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1, "Ivanov", 12);
        Employee1 emp2 = new Employee1("Petrov", 78);
        Employee1 emp3 = new Employee1(2, "Sidorov", 45, 34, "management");
        System.out.println(emp3.department);
    }
}
