public class ncr {
    public static int fact(int x){
        int factorial=1;
        for (int i = 1; i <=x; i++) {
            factorial=factorial*i;
        }
        
        return factorial;
    }
    public static int binocoeff(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int binocoeff = a/(b*c);
        return binocoeff;
    }
    public static void main(String[] args) {
        
        System.out.println(binocoeff(8,5));
        
    }

   
}
