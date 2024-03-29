import java.util.Scanner;

public class conditions {
    public static Scanner scanner = new Scanner(System.in); // to use scanner1

    public static void main(String[] args) {
        int age = 12;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult.\nYou are just " + age + " years old");
        }
        /*
         * You are not an adult.
         * You are just 12 years old
         */

        // if , else if chaining
        int year = 20003;
        if (year == 2000) {
            System.out.println("Born in 2000");
        } else if (year == 2001) {
            System.out.println("Born in 2001");
        } else if (year == 2003) {
            System.out.println("Born in 2003");
        } else {
            System.out.println("Born in " + year);
        }
        // Born in 20003

        // switch condition
        int driverAge = 16;
        switch (driverAge) {
            case 16:
                System.out.println("16");
                break;
            case 17:
                System.out.println("17");
                break;

            default:
                break;
        }
        // 16

        // logical operator
        boolean isPass = true;
        int dAge = 16;

        if (isPass && dAge >= 18) {
            System.out.println("You can apply for driving lisence");
        } else if (isPass && dAge >= 16) {
            System.out.println("You can apply for learner lisence");
        } else {
            System.out.println("You are not aligible");
        }
        ; // You can apply for learner lisence

        System.out.println("Number: ");
        int number = scanner.nextInt(); // used to get input from user

        switch (number) {
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break;

            default:
                System.out.println("I dont know");
                break;
        }

        // Number:
        // 10
        // Number is 10

        // Enhansed switch
        System.out.println("Enter time:1");
        int time = scanner.nextInt();
        switch (time){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("Not found");
        }

    };

}
