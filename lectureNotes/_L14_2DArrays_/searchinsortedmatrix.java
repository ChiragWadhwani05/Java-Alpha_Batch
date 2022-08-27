public class searchinsortedmatrix {
    private static void search(int matrix[][], int n) {
        int startrow = 0;
        int startcol = matrix.length - 1;
        while (startrow < matrix.length - 1 && startcol >= 0) {
            if (matrix[startrow][startcol] > n) {
                startcol--;
            } else if (matrix[startrow][startcol] < n) {
                startrow++;
            }
        }
        if (matrix[startrow][startcol] == n) {
            System.out.println("KEY FOUND AT " + startrow + " , " + startcol);
        } else {
            System.out.println("KEY DOES NOT EXIST !!");

        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 60;
        search(matrix, key);
    }
}
