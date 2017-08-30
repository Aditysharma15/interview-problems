package company;

/**
 * Created by Tuhin on 2/19/2017.
 */
public class StringAlgorithm {


    public Boolean paranthesis(String val){
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
