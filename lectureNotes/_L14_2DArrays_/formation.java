import java.util.Scanner;

public class formation{
   public static void find(int arr[][]) {
    int smallest=Integer.MAX_VALUE;
   int largest =Integer.MIN_VALUE; 
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j]>largest){
            largest=arr[i][j];
        }
         if(arr[i][j]<smallest){
            smallest=arr[i][j];
        }
        }
    }
    System.out.println(largest);
    System.out.println(smallest);
   }
    public static void main(String[] args) {
      int n=3;
      int m=3;
        int arr[][]=new int[n][m];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        find(arr);
    }
}