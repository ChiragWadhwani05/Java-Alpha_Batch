package lectureNotes._L18_Recursion_;



public class tilingProblem {
    public static int calcWays(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        
        int forV = calcWays(n-1);
        int forH = calcWays(n-2);
        return (forH+forV);
    }
  
    public static void main(String[] args) {
        System.out.println(calcWays(3));
    }
}
