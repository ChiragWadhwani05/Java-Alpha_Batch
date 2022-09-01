class substring {
    public static String sub(String name, int start, int end) {
        String str = "";
        for (int i = start; i <= end; i++) {
            str += name.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String name = "Chirag wadhwani";
        System.out.println(sub(name, 0, 7));
        System.out.println(name.substring(0, 9)); // inbuilt function
    }

}
