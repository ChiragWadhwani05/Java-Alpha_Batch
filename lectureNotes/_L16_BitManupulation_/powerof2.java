public class powerof2 {
    public static boolean check(int number) {
        return (number & (number-1))==0 ;
    }
    public static void main(String[] args) {
        System.out.println(check(15));
    }
}
