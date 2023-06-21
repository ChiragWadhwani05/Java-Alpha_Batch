package lectureNotes._L18_Recursion_;


public class printReverse {
    public static void printRev(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }
    public static void main(String[] args) {
        printRev(10);
    }
}
