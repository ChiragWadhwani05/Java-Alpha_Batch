public class comparision {
    public static void main(String[] args) {
        String s1 = "Chirag";
        String s3 = "Chirag";
        String s2 = new String("Chirag");
        if (s1.equals(s2)) {
            System.out.println("STRINGS ARE EQUAL");
        }
        System.out.println(s1.equals(s3));
    }
}
// .equals is an inbuilt function..