public class printprime {
    public static boolean isprime(int b) {

        for (int i = 2; i <= Math.sqrt(b); i++) {
            if (b % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void prime(int n) {
        for (int i = 2; i < n; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
           
        }
    }

    public static void main(String[] args) {
        prime(100);
    }
}
