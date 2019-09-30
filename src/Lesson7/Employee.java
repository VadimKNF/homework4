package Lesson7;

public class Employee {
    public double salary;

    public void dvsal(){
        System.out.println("novaya zp " + salary * 2);
    }
    public Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(12);
        System.out.println(emp.salary);
        emp.dvsal();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(20);
        System.out.println(emp.salary);
        emp.dvsal();
    }
}