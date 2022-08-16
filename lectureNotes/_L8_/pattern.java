public class pattern{
public static void main(String args[]){
int n=10;
//this loop is for number of lines

for(int i =0 ;i<n;i++){
// this loop is for number of stars in each line
  for(int j =n;j>i;j--){
  System.out.print("*");
  }
  System.out.println();
}
}
}
