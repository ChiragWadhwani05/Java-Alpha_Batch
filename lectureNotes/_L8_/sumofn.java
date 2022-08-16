import java.util.*;
public class main{
 public static void sumofn(String[] args){
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
