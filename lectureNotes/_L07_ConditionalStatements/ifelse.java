package lectureNotes._L7_ConditionalStatements;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        // this code wil tell whaat's your age category.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age : ");
        int age = sc.nextInt();

        if (age <= 12 && age>1) {
            System.out.println("CHILD");
        } else if (age >= 13 && age < 18) {
            System.out.println("TEENAGER");
        } else if (age >= 18 && age < 105) {
            System.out.println("ADULT");
        } else if (age < 1) {
            System.out.println("NOT BORN YET");
        } else {
            System.out.println("GHOST");
        }
    }
}

