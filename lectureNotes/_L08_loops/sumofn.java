import java.util.*;
public class sumofn{
 public static void main(String[] args){
 Scanner sc =new Scanner(System.in);
System.out.print("ENTER N :"); 
 int n= sc.nextInt();
int sum = 0;
int count = 1;
  while(count<=n){
System.out.println(count);
sum=sum+count;
count++;
}
System.out.println("SUM =" + sum);

}

}
