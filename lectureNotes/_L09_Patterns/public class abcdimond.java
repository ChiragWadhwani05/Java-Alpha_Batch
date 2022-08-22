public class abcdimond {
    public static void main(String[] args) {
        int n = 26;
        char a = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                if(j==0||j==i*2){
                    System.out.print(a);
                }
                else{
                    System.out.print(" ");
                }
            }
        }
            
            
            System.out.println();
            a++;
        }
        
    }   

