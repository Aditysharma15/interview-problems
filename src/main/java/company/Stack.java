package company;

/**
 * Created by Tuhin on 2/20/2017.
 */
public class Stack {

    char[] stack= new  char[100];
    int top=-1;
    int min;
    public void push(char val){
        int min= val;
        if(!isempty()){
            if (min>stack[top]) {
                min = stack[top];
            }
        }
        else{
            min=val;
        }
        stack[++top]=val;



    }
    public int min(){
        return min;

    }

    public char pop(){
        return stack[top--];
    }

    public Boolean isempty(){
        return top==-1;
    }


}
