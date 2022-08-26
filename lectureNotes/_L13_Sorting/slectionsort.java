public class slectionsort {
    public static void slection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int n = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[n] > arr[j]) {
                    n = j;
                }

            }
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        slection(arr);
    }
}
