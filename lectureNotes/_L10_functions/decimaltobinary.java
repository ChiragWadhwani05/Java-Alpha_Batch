
public class decimaltobinary {
    public static void dtob(int decimal) {
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int reminder = decimal % 2;
            binary = binary + reminder * (int) Math.pow(10, pow);
            pow++;
            decimal = decimal / 2;

        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        dtob(5);
    }

}