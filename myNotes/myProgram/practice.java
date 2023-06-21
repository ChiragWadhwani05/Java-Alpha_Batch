
public class practice{
  public static void main(String[] args) {
    String str1 = "12.3";
    String str2 = "1.23";

    System.out.println(isAnagrams(str1, str2));
}

public static boolean isAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
        return false;
    }

    int length = str1.length();
    int[] frequencies = new int[91];

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    for (int i = 0; i < length; i++) {
        frequencies[str1.charAt(i) - ' ']++;
        frequencies[str2.charAt(i) - ' ']--;
    }
    
    for (int i = 0; i < frequencies.length; i++) {
        if(frequencies[i] != 0) {
            return false;
        }
    }

    return true;
}
}