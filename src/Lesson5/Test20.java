package Lesson5;

import Lesson6.Employee1;
import Lesson7.Employee;

public class Test20 {
    int sum(int a, int b, int c){
        return a + b + c;
    }

    int averageCount(int a1, int b1, int c1){
        return sum(a1, b1, c1) / 3;
    }
}

class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();
        System.out.println("digit sum: " + t.sum(1, 2, 3));
        System.out.println("digit average: " + t.averageCount(1, 2, 3));
        Employee1 e2 = new Employee1(500);
        e2.showSalary();
        Employee1 e3 = new Employee1(400);

    }
}
