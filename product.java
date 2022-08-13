import java.util.*;

class product{
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a =sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b =sc.nextInt();
        int product = a*b;
        System.out.println("Product of given numbers is =" + product);
    }
}
