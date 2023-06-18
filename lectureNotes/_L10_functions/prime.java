public class prime {
    public static boolean checkprime(int n){
       
        boolean checkprime =true;
        for (int i = 2; i <Math.sqrt(n); i++) {
            if(n%i==0){
          checkprime =false;
                break;

            }
        }
        return checkprime;
    }
    public static void main(String[] args) {
       System.out.println(checkprime(2)); 
    }
}
