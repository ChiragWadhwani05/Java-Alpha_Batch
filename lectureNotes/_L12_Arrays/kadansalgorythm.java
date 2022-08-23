import java.util.*;

class kadansalgorythm {
    public static void kadanalgorythm(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentsum = currentsum + numbers[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            maxsum = Math.max(currentsum, maxsum);
        }
        System.out.println("MAX SUM = " + maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanalgorythm(numbers);
    }
}
