public class countingsort {
    public static void countsort(int arr[]) {
       int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
        int freqArr[] =new int[max+1];
        for (int i = 0; i < arr.length; i++) {
              freqArr[arr[i]]++;  
        }
            int j=0;
        for (int i = 0; i < freqArr.length; i++) {
             while (freqArr[i]>0) {
                arr[j]=i;
                j++;
                freqArr[i]--;
             }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,5,6,7};
        countsort(arr);
    }
}
