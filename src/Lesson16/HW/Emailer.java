package Lesson16.HW;

public class Emailer {
    public static void main(String[] args) {
        String e = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(e);
    }

    public static void email(String e){
        int x = 0;
        int y = 0;
        int z = 0;

        while(z < e.length() - 1){
            x = e.indexOf('@', z);
            y = e.indexOf('.', z);
            z = e.indexOf(';', z + 1);
            System.out.println(e.substring(x + 1, y));


        }

        }

    }

