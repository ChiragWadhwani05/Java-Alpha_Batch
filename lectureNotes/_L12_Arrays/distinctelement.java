public class distinctelement {
    public static boolean check(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4 };
        System.out.println(check(arr));
    }
}
//it is not a best solution 
//time complexity =O(n^2)