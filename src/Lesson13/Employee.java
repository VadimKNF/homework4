package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("Monday"){
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println("till 18:00");
                break;
            case "Saturday":
                System.out.println("till 14:00");
                break;
            case "Sunday":
                System.out.println("no work");
                break;
            default:
                System.out.println("incorrect day");
        }
    }
}
