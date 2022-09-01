public class bitwiseoperators {
    public static void main(String[] args) {
        // binary &
        // 0 & 0=0 , 0 & 1 =0 , 1 & 1 = 1
        System.out.println(5 & 6);
        // binary |
        // 0 | 0=0 , 0 | 1 =1 , 1 | 1 = 1
        System.out.println(5 | 6);
        // binary ^
        // 0 ^ 0=0 , 0 ^ 1 =1 , 1 ^ 1 = 0
        System.out.println(5 ^ 6);
        
        // binary ~
        // ~ 0=1 ,  ~ 1 =0 
        System.out.println( ~ 0);

        // binary left shift <<
        System.out.println(5<<2);
        
        // binary right shift >>
        System.out.println(6>>2);
    }
}
