public class checlpdrome {
    public static boolean palindrome(int n) {
        int number=n;
        int newnumber = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            newnumber = newnumber * 10 + lastdigit;
            n = n / 10;
        }
        if (number == newnumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome(123421));
    }
}
