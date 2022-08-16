package lectureNotes._L7_ConditionalStatements;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YEAR :");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("YEAR " + year + " IS A LEAP YEAR");

                } else {
                    System.out.println("YEAR " + year + " IS NOT A LEAP YEAR");
                }
            } else {
                System.out.println("YEAR " + year + " IS A LEAP YEAR");
            }
        } else {
            System.out.println("YEAR " + year + " IS NOT A LEAP YEAR");
        }
    }

}
