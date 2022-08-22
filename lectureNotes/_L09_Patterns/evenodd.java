import java.util.*;
public class evenodd{
    public static void main(String args[]){
        System.out.print("ENETR YOUR NUMBER : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even=0;
        int odd=0;
      
        while(n!=0){
            //int a=n%10;
            if((n%10)%2==0){
                even=even+(n%10);
            }else{
                odd=odd+(n%10);
            }
            n=n/10;
        }
        System.out.print("SUM OF ODD DIGITS = "+ odd);
        System.out.println();
        System.out.print("SUM OF EVEN DIGITS = "+ even);
    }
}