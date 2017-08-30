package company;

/**
 * Created by Tuhin on 2/22/2017.
 */
public class StackMin {

    int[] stack;
    int top=-1;
    int min=Integer.MAX_VALUE;
    public StackMin(int[] stack){
        this.stack=stack;
        //this.top=top;
    }
    public int pop(){
        int val=stack[top--];
        return val;
    }

    public void push (int val){
        if (val<min){
            min=val;
        }
        
        stack[++top]=val;
    }

    public Boolean isempty(){
        return top==-1;
    }

    public int peek(){
        return stack[top];
    }
    public int min(){
        return min;
    }
    public void print(StackMin stackObj){
        int[] stack=stackObj.stack;
        for (int val:stack){
            System.out.println("val = " + val);
        }
    }
    public static void main(String[] args) {
        int[] stackMin=new int[10];
        StackMin stack= new StackMin(stackMin);
        stack.push(6);
        stack.push(9);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        stack.push(7);
        stack.print(stack);
        System.out.println("stack.min() = " + stack.min());

    }
}
