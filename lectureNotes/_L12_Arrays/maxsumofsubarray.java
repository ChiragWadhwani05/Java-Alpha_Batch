class maxsumofsubarray {
    public static void calculatesum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentsum = 0;
                System.out.print("( " + arr[i] + " ");
                currentsum = currentsum + arr[i];
                for (int j2 = i + 1; j2 < j + 1; j2++) {
                    System.out.print("," + arr[j2] + " ");
                    currentsum = currentsum + arr[j2];
                }
                System.out.print(")" + "  ");

                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.print("MAXIMUM SUM = " + maxsum);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -6, -1, -3 };
        calculatesum(arr);
    }
}
