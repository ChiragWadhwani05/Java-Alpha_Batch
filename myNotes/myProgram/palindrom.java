package myNotes;
public class palindrom {
    public static void main(String[] args) {
        for ( int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i+1; j >=2 ;j--) {
                System.out.print(j+ " ");
                
            }

            
            for (int j = 0; j <= i ;j++) {
                System.out.print(j+1 + " ");
                
            }
            System.out.println();
        }
    }
}
