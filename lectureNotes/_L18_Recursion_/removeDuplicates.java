package lectureNotes._L18_Recursion_;

public class removeDuplicates {
    public static void removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]) {
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        char curChar = str.charAt(idx);
        if (map[curChar-'a']==true) {
            removeDuplicate(str, idx+1, newstr, map);
        }else{
            map[curChar-'a']=true;
            removeDuplicate(str, idx+1, newstr.append(curChar),map);
        }
    }
    public static int contiguousSubstrings(String str,int start ,int end) {
        
        if (start>=end ) {
            return 0;
        }
        int count=0;
        if (str.charAt(start)==str.charAt(end)) {
            //System.out.println(str.substring(start, end-1));
            count++;
        }
       count += contiguousSubstrings(str, start+1, end-1);
        count+=contiguousSubstrings(str, start+1, end);
        count+=contiguousSubstrings(str, start, end-1);
        return count;
    }
    public static void main(String[] args) {
       // String str = "chiragwadhwani";
        String newstr =new String("aba");
        
        // removeDuplicate(str, 0, newstr, new boolean[26]);
        System.out.println(contiguousSubstrings(newstr, 0, newstr.length()-1));

    }
}
