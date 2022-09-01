class charAt {
    public static void main(String[] args) {
        String firstname = "Chirag";
        String lastname = "wadhwani";
        String concatination = firstname + " " + lastname;
        System.out.println(concatination);// Concatination..
        for (int i = 0; i < concatination.length(); i++) {
            System.out.println(concatination.charAt(i));

        }
    }
}