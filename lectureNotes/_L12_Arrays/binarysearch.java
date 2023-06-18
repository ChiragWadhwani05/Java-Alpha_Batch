
 class binarysearch {
    public static int search(int arr[], int number) {
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Called");
        while (start <=   end) {
            int midvalue = (start + end) / 2;
            if (arr[midvalue] == number) {
                return midvalue;
            }
            if (arr[midvalue] > number) {
                end = midvalue-1;
            } else {
                start = midvalue+1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 26, 33 };
        int key = 2;
        int index = search(numbers, key);
        System.out.println("Started");
        if (index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("KEY FOUND AT INDEX : " + index);
        }
    }
}
