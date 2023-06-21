package lectureNotes._L18_Recursion_;

public class factorial {
    public static int fact(int n) {
        int factorial=0;
        if (n==0) {
            return 1;
        }
        factorial=n*fact(n-1);
        
        return factorial;
    }
    public static int sumOfN(int n) {
        if (n==1) {
            return 1;
        }
        int cursum =n+ sumOfN(n-1);
       
        return cursum;
        
    }
    
    public static int calcFebonacci(int n) {
        if (n==1) {
            return 1;
        } else if (n==0) {
            return 0;
        }
        int febN= calcFebonacci(n-1)+calcFebonacci(n-2);

        return febN;
    }
    public static void main(String[] args) {
       // System.out.println(fact(5));
    //    System.out.println(sumOfN(4));
        System.out.println(calcFebonacci(4));

    }
}
