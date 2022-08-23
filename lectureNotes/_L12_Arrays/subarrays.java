class subarrays {
    public static void makesubarrays(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                System.out.print(arr[i] +" ");
                sum = sum + arr[i];
                for (int j2 = i + 1; j2 < j + 1; j2++) {
                    System.out.print("," + arr[j2] + " ");
                    sum = sum + arr[j2];
                }
                System.out.println();
                System.out.print("SUM = " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        makesubarrays(arr);
    }
}
