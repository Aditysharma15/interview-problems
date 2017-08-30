package company;

/**
 * Created by Tuhin on 2/25/2017.
 */
/*
public class RecurseReverse {

    int n =-1;

        public String reverse(String str) {
            // your code here

            if(str.length()==1){
                return str;
            }
            else{

                reverse=
                str=reverse(str.substring(0,str.length()-1));
                System.out.println(str);
            }

            return str;
        }

}
*/
import java.lang.Character.Subset;

public class RecurseReverse {
    private static String rev = "";

    public static void main(String[] args) {

        System.out.println(reverse("ahmd"));
    }

    public static String reverse(String s) {

        if (s.length() == 1) {

            return s;
        } else {
            String substring = s.substring(1);
            rev = rev.concat(reverse(substring))+
                    s.charAt(0);
            return rev;
        }

    }

}