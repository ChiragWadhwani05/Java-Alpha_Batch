package lectureNotes._L18_Recursion_;

public class checkSortedArray {
    
    public static boolean checkSort(int arr[],int i) {
        
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
       
        return checkSort(arr,i+1);
    }
    public static int firstOccurance(int arr[],int target,int i) {
        if (arr[i]==target) {
            return i;
        }else if (i==arr.length-1) {
            return -1;
        }
        return firstOccurance(arr, target, i+1);
        
    }
    public static void allOccurance(int arr[],int target,int i) {
        if (i>=arr.length) {
            return;
        }
        if (arr[i]==target) {
            System.out.println(arr[i] +" ," +i);
        }
       
        allOccurance(arr, target,i+1);
    }
    public static int lastOccurance(int arr[],int target, int i) {
        if (i==-1) {
           return-1; 
        }else if (arr[i]==target) {
            return i;
        }
        return lastOccurance(arr, target, i-1);
        
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,3,5,3};
       // System.out.println(checkSort(arr, 0));
       // System.out.println(firstOccurance(arr, 4, 0));
        // System.out.println(lastOccurance(arr, 4, (arr.length-1)));
        allOccurance(arr, 3, 0);
    }
    
}