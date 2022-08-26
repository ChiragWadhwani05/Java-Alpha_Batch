class bubblesort {
    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        bubble(arr);

    }
}
//time complexcity =O(n^2)