class palindrome {
    public static boolean check(String name) {
        int end = name.length();
        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(end - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String name = "nammnan";
        System.out.println(check(name));
    }
}
