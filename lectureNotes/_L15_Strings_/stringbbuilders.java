public class stringbbuilders {
    public static String touppercase(String sentence) {
        StringBuilder str = new StringBuilder("");
        char ch = Character.toUpperCase(sentence.charAt(0));
        str.append(ch);
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                str.append(sentence.charAt(i));
                i++;
                str.append(Character.toUpperCase(sentence.charAt(i)));
            } else {
                str.append(sentence.charAt(i));
            }

        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        for (char i = 'a'; i <= 'z'; i++) {
            str.append(i);
        }
        // System.out.print(str);
        String sentence = "hi , i am chirag";
        System.out.print(touppercase(sentence));
    }
}
//INBUILT FUNCTIONS OF STRING BUILDERS
//append  function
//ToUppercase function

