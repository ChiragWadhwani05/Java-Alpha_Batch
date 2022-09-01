public class direction {
    public static float calculatepath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W') {
                x--;
            } else if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            }
        }
        int squares = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
        return (float) Math.sqrt(squares);

    }

    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        System.out.println(calculatepath(directions));
    }
}
