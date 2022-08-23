class reverse {
    public static void reversearray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end = end - 1;
            start = start + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 8, 9 };
        reversearray(arr);

    }
}
