package company;

/**
 * Created by Tuhin on 2/11/2017.
 */
public class StringIndexOf {

    public static int indexOf(String source, String toSearch) {

        if (toSearch.length() > source.length()) {
            return -1;
        }
        if (source == "") {
            return 0;
        }
        if (toSearch == "") {
            return 0;
        }
        int i, j;
        int count=0;
        for (i = 0, j = 0; i < source.length(); i++) {

            if (source.charAt(i) == toSearch.charAt(j)) {

                j++;

                if (j == toSearch.length()) {
                    // System.out.println(j+i);
                    // System.out.println(i-toSearch.length());
                    count=1;
                    break;
                }
            } else {
                j = 0;

            }
        }
        if (count==1 ){

            return i - toSearch.length()+1;
        }
        else{
            return -1;
        }
    }

    public static boolean compareFunc(String s1, String s2)
    {
        int r1 = s1.indexOf(s2);
        int r2 = indexOf(s1, s2);
        boolean ret = (r1==r2);
        System.out.println(ret + " for '" + s1 + "' '" + s2 + "' -> " + r1 + " " + r2);
        return ret;
    }

    public static void main (String[] args)
    {
        // Empty string
        compareFunc("", "");
        compareFunc("A", "");
        compareFunc("AB", "");
        compareFunc("", "A");
        compareFunc("", "AB");
        // Equal non-empty strings
        compareFunc("A", "A");
        compareFunc("AB", "AB");
        compareFunc("ABC", "A");
        // Match at the beginning
        compareFunc("A", "AB");
        compareFunc("AB", "ABC");
        compareFunc("ABC", "ABD");
        // Match at the end
        compareFunc("B", "AB");
        compareFunc("BC", "ABC");
        compareFunc("ABC", "DBC");
        // Match at the middle
        compareFunc("BC", "ABCD");
        compareFunc("CD", "ABCDEF");
        // No match on longer strings
        compareFunc("QWERTYUIOPASDFGHJKL", "ZXCVBNM");
        compareFunc("ZXCVBNM","QWERTYUIOPASDFGHJKL");
        System.out.println("Test successful");
    }
}