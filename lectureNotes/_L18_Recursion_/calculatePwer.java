package lectureNotes._L18_Recursion_;

public class calculatePwer {
    
    public static long calcPow(int x , int n) {
        if (n==0) {
            return 1;
        }
        long optimizedCalculation= calcPow(x, (n/2));
        if (n%2==0) {
           // return calcPow(x, (n/2)) * calcPow(x, (n/2));
           return (optimizedCalculation *optimizedCalculation);
        } else{
            //return x * calcPow(x, (n/2)) * calcPow(x, (n/2));
            return x *optimizedCalculation*optimizedCalculation;
        }
    }
    public static void main(String[] args) {
        System.out.println(calcPow(2, 50));
    }
}
