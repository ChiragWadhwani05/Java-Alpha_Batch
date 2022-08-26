import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class inbuiltsort{
    public static void main(String[] args) {
        Integer arr[]={4,5,3,2,6,1};
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //reverseOrder function works on object (Integer not int)
}