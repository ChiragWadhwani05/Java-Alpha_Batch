package lectureNotes._L7_ConditionalStatements;

import java.util.Scanner;

public class calculaterby_switch {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("ENTER 1st NUMBER : ");
      int a = sc.nextInt();
      System.out.print("ENTER 2nd NUMBER : ");
      int b = sc.nextInt();
      System.out.print("ENTER OPERATER : ");
      char ch = sc.next().charAt(0);
      switch (ch) {
         case '+':
            System.out.println(a + b);
            break;
         case '-':
            System.out.println(a - b);
            break;
         case '/':
            System.out.println(a / b);
            break;
         case '*':
            System.out.println(a * b);
            break;
         case '%':
            System.out.println(a % b);
            break;
         default:
            System.out.println("ENTER VALID OPERATOR.....");
      }
   }

}
