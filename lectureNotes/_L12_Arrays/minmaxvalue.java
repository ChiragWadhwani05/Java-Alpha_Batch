import java.util.*;
class minmaxvalue {
public static int check(int arr[]) {
    int largest=Integer.MIN_VALUE; //-infinity
    int smallest= Integer.MAX_VALUE; // +infinity
    for (int i = 0; i < arr.length; i++) {
        if(largest<arr[i]){
            largest=arr[i];
        }
    }
    for (int i = 0; i < arr.length; i++) {
        if(smallest>arr[i]){
            smallest=arr[i];
        }
    }
    System.out.println("SMALLEST NUMBER : "+smallest);
    return largest;
}
    public static void main(String[] args) {
        int numbers[] = { 1, 3, 7, 9, 3, 5, 9, 17, 10 };
        
        int index=check(numbers);
        System.out.println("LARGEST NUMBER : "+index);
    }
}
