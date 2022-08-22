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
            System.out.println();
            a++;
        }
        char z = 'Y';

              for (int i = n-2; i >=0; i--) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                if(j==1||j==i*2+1){
                    System.out.print(z);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            z--;
        }
            
           
        }
        
    }   

