package company;

/**
 * Created by Tuhin on 2/28/2017.
 */
public class Brackets {

    static String[] braces(String[] values) {

        String[] returnArray;
        if(values==null){
            return new String [] {"YES"};
        }
        int length= values.length;
        if(length==0){
            return new String [] {"YES"};
        }
        else {
             returnArray = new String[values.length-1];
        }

        //char[] charValues=values.toCharArray();
        for (int i=1;i<length;i++){
            String first= values[i];

            returnArray[i-1] = paranthesis(first);
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
                if (!stack.isempty()) {
                    char b = stack.pop();
                    if (b == '{') {
                        continue;
                    } else {
                        System.out.println("they arenot in sequence");
                        returnString= "NO";
                        break;
                    }
                } else {
                    System.out.println("they arenot in sequence");
                    returnString = "NO";
                    return returnString;

                }
            }
        }
        if (stack.isempty()) {
            returnString ="Yes";
            return returnString;
        } else {
            returnString= "NO";
            return returnString;
        }
    }


    public Boolean paranthesis1(String val){

        char[] valArray=val.toCharArray();
        Stack stack=new Stack();
        int count=0;
        for(char a:valArray){
            if (a == '{') {
                stack.push('{');

            }
            if (a == '}') {
                if(!stack.isempty()) {
                    char b = stack.pop();
                    if (b == '{') {
                        continue;
                    } else {
                        System.out.println("they arenot in sequence");
                        break;
                    }
                }
                else{
                    System.out.println("they arenot in sequence");
                    return false;
                }
            }
        }
        if (stack.isempty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        StringAlgorithm sa= new StringAlgorithm();
        System.out.println("sa = " + sa.paranthesis("{{{{}}}}{}{}{}{}{}{}{}{}{}{}{{{}}}"));
        System.out.println("sa.paranthesis =2 " + sa.paranthesis("{{{{}}}}{}{}{}{{}{}{}{}{}{}{}{{{}}}"));
        System.out.println("sa.paranthesis(\"{}{\") = " + sa.paranthesis("{}{"));
        System.out.println("sa.paranthesis(\"}{\") = " + sa.paranthesis("}{"));
        System.out.println("sa.paranthesis(\"{{{{{{{{}}}}}}}}\") = " + sa.paranthesis("{{{{{{{{}}}}}}}}"));
    }
}
