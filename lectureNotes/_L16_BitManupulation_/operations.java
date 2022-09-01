public class operations {
   public static int getbit(int n,int pos) {
    int bitmask = 1<<pos;
    if((n&bitmask)==0){
        return 0;
    }else{
        return 1;
    }
   }
   public static int setbit(int n ,int pos) {
       int bitmask = 1<<pos;
       int newnum = n | bitmask;
       return newnum;
   }
   public static int clearbit(int n, int pos) {
       int num = ~(1<<pos);
       return n & num;
   }
   public static int updatebit(int n,int pos,int newbit) {
       if(newbit==0){
           return clearbit(n, pos);
    }else{
           return setbit(n, pos);
       }
   }
   public static int clearlastbits(int n , int pos) {
       int bitmask = -1<<pos;
       return n & bitmask;
   }

    public static void main(String[] args) {
        
       // System.out.println(getbit(10, 2));
        //System.out.println(setbit(10, 2));
       // System.out.println(clearbit(10, 1));
      // System.out.println(updatebit(10, 2, 1));
      System.out.println(clearlastbits(15, 2));
    }
}
