public class linearsearch {
    public static int check(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 7, 9, 3, 0, 5, 9, 17, 10 };
        int key = 6;
        int index = check(numbers, key);
        if (index == -1) {
            System.out.println("NOT FOUND");

        } else {
            System.out.println("KEY FOUND AT INDEX : " + index);
        }

    }
}