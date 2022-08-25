class trappingrainwater {
    public static void calculatewater(int arr[]) {
        // first we have to make auxlari(helper) arrays to calculate max heights (left
        // and right) of each building (element).
        int water = 0;
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            leftmax[i] = arr[i];
            rightmax[i] = arr[i];
        }
        for (int i = 1; i < leftmax.length; i++) {
            if (leftmax[i] < leftmax[i - 1]) {
                leftmax[i] = leftmax[i - 1];
            }
        }
        for (int i = rightmax.length - 2; i >= 0; i--) {
            if (rightmax[i] < rightmax[i + 1]) {
                rightmax[i] = rightmax[i + 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (rightmax[i] <= leftmax[i]) {
                water += (rightmax[i] - arr[i]);
            } else {
                water += (leftmax[i] - arr[i]);
            }
        }
        System.out.print("TOTAL VOLUME OF WATER TRAPPED BETWEEN BUILDING = " + water);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7 };
        calculatewater(arr);

    }
}