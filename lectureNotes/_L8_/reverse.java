import java.util.*;
class reverse{
 public static void main(String[] args){
 Scanner sc =new Scanner(System.in);
System.out.print("ENTER N :"); 
 int n= sc.nextInt();
int reverse =0;
while(n!=0){
System.out.print(n%10);
reverse=reverse*10+(n%10);
n=n/10;
}
System.out.println();
System.out.println(reverse);
}

}
