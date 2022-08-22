public class binarytodecimals {
    public static void btod(int binary) {
        int pow = 0;
        int decimal = 0;
        while (binary > 0) {
            int ld = binary % 10;
            decimal = decimal + (ld * (int) Math.pow(2, pow));
            pow++;
            binary = binary / 10;
        }
        System.out.println("Decimal number = " + decimal);
    }

    public static void main(String[] args) {
        btod(101);
    }

}