class abcpattern {
    public static void main(String[] args) {
        int n = 3;
        char a = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
           
            for (char j = a; j <= a + i; j++) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }

}
