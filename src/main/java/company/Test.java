package company;

/**
 * Created by Tuhin on 2/28/2017.
 */

import java.util.Stack;
public class Test {

/*
 * Complete the function below.
 */


    static String[] braces(String[] values) {

        String[] returnArray;
        if (values == null) {
            return new String[]{"YES"};
        }
        int length = values.length;
        if (length == 0) {
            return new String[]{"YES"};
        } else {
            returnArray = new String[values.length - 1];
        }


        for (int i = 1; i < length; i++) {
            String first = values[i];

            returnArray[i - 1] = paranthesis(first);
        }
        for(int i=0; i < returnArray.length; i++){
            System.out.println("this is "+returnArray[i]);
        }


        return returnArray;
    }


    public static String paranthesis(String val) {

        char[] valArray = val.toCharArray();
        String returnString;
        Stack stack = new Stack();
        int count = 0;
        for (char a : valArray) {
            if (a == '{') {
                stack.push('{');

            }
            if (a == '}') {
                if (!stack.empty()) {
                    char b = (char) stack.pop();
                    if (b == '{') {
                        continue;
                    } else {
                        // System.out.println("they arenot in sequence");
                        returnString = "NO";
                        break;
                    }
                } else {
                    //System.out.println("they arenot in sequence");
                    returnString = "NO";
                    return returnString;

                }
            }
        }
        if (stack.empty()) {
            returnString = "Yes";
            return returnString;
        } else {
            returnString = "NO";
            return returnString;
        }
    }


    public static void main(String[] args) {

        Test test= new Test();
        String[] values={"2","{}[]()","{[}]}","{{[[(())]]}}"};
        braces(values);
    }

}


