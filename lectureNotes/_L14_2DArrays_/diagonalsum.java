public class diagonalsum {
    public static void sum(int matrix[][]) {
        int primarydiagonal = 0;
        int secondarydiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i + j == matrix.length - 1) {
                    secondarydiagonal += matrix[i][j];
                }
                if (i == j) {
                    primarydiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("SUM OF PRIMARY DIAGONAL = " + primarydiagonal);
        System.out.println("SUM OF SECONDARY DIAGONAL = " + secondarydiagonal);
    }// Time complexity = O(n^2)

    public static void optimizedsum(int matrix[][]) {
        int prsum = 0;
        int sesum = 0;
        for (int i = 0; i < matrix.length; i++) {
            prsum += matrix[i][i];
            sesum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("SUM OF PRIMARY DIAGONAL = " + prsum);
        System.out.println("SUM OF SECONDARY DIAGONAL = " + sesum);
        // Time complexity = O(n)
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        sum(matrix);
        optimizedsum(matrix);
    }
}
