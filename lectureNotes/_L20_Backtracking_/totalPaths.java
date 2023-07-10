package _L20_Backtracking_;

public class totalPaths {
    public static void printPath(int answer[][]){
      for (int i = 0; i < answer.length; i++) {
        for (int j = 0; j < answer[0].length; j++) {
          System.out.print(answer[i][j]+ " ");
        }
        System.out.println();
      }
      System.out.println();
    }
    public static void findPaths(int matrix[][],int x,int y,int answer[][]){
     
      // int m=matrix.length-1;
      // int n=matrix[0].length-1;
      if (x<0||y<0||x>matrix.length-1||y>matrix[0].length-1) {
        return;
      }
      if (matrix[x][y]==0||answer[x][y]==1) {
       
        return;
      }
       else if (matrix[x][y]==1&&answer[x][y]==0) {
        answer[x][y]=1;
      }
        if (x==matrix.length-1&&y==matrix[0].length-1) {
        printPath(answer);
        answer[x][y]=0;
        return;
      }
      findPaths(matrix, x, y-1,answer);
      findPaths(matrix, x, y+1,answer);
      findPaths(matrix, x+1, y,answer);
      findPaths(matrix, x-1, y,answer);
      answer[x][y]=0;
    }
    public static void main(String[] args) {
        int matrix[][]={ { 1, 1, 0, 0,0 },
                         { 0, 1, 0, 1,0 },
                         { 1, 1, 0, 0,0 },
                         { 1, 1, 1, 1 ,1} };
        int answer[][]= new int[matrix.length][matrix[0].length];
        findPaths(matrix, 0, 0,answer);
    }
}