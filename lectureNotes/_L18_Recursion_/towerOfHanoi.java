package lectureNotes._L18_Recursion_;

public class towerOfHanoi {
    public static void writeSteps(int n,String source , String helper , String destination) {
        if (n==1) {
            
            System.out.println("transfer disk "+ n +" from "+ source + " to "+ destination);
            return;
        }
        writeSteps(n-1, source, destination, helper);
        System.out.println("transfer disk "+ n +" from "+ source + " to "+ destination);
        writeSteps(n-1, helper, source, destination);

        
        
    }
    public static void binaryStrings(int n, int lastDigit ,String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }
        binaryStrings(n-1, 0, str+"0");
        if (lastDigit==0) {
            // binaryStrings(n-1, 0, str.append("0"));
            binaryStrings(n-1,1, str+"1");
        }
        
    }
    
    public static void main(String[] args) {
        int n =3;
        
        // writeSteps(n, "S", "H", "D");
        binaryStrings(n, 0, "");
    }
}
