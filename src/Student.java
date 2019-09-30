public class Student {

    Student(String n1, String c1, int cardNum1, int courseNum1){
        this(n1, c1, cardNum1, courseNum1, 0.0, 0.0, 0.0);
    }

    Student() {

    }

    Student(String n, String c, int cardNum, int courseNum, double m, double ec, double en){
        name = n;
        curname = c;
        cardNumber = cardNum;
        courseNumber = courseNum;
        countEconom = ec;
        countEnglish = en;
        countMath = m;
    }

    String name;
    String curname;
    int cardNumber;
    int courseNumber;
    double countMath;
    double countEconom;
    double countEnglish;

    double counter(){
        //a = countEconom;
        //b = countEnglish;
        //c = countMath;
        return (countMath + countEnglish + countEconom) / 3;
    }

}

class StudentTest{
    public static void main(String[] args) {

        Student s1 = new Student("Ivan", "Raspizdyaev", 12, 4, 3, 3, 3);
        System.out.println(s1.name + " " + s1.curname + " " + "imeet sredniy ball: " + s1.counter());
        Student s2 = new Student("Pizda", "Tupaya", 10, 2);
        System.out.println(s2.name + " " + s2.curname + " " + "nomer kartochki: " + s2.cardNumber);
        Student s3 = new Student();
        System.out.println(s3.name + " " + s3.curname + " " + "imeet sredniy ball: " + s3.counter());

    }
}
