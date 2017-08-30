package company;

/**
 * Created by Tuhin on 2/22/2017.
 */
public class QueueWithStack{

    int[] stack1Array= new int[10];
    int[] stack2Array= new int[10];
    Stack stack1= new Stack(stack1Array);
    Stack stack2= new Stack(stack2Array);

    public int dequeue(){
        int val;
        if(stack2.isempty()&&stack1.isempty()){
            throw new IndexOutOfBoundsException();
        }

        if (!stack2.isempty()){
            return stack2.pop();
        }
        else{
            while(!stack1.isempty()){
                stack2.push(stack1.pop());

            }
            return stack2.pop();
        }
    }

    public void enqueue(int val){

        stack1.push(val);
    }

    public class Stack{
        int[] stack;
        int top=-1;

        public Stack(int[] stack){
            this.stack=stack;
            //this.top=top;
        }
        public int pop(){
            int val=stack[top--];
            return val;
        }

        public void push (int val){
            stack[++top]=val;
        }

        public Boolean isempty(){
            return top==-1;
        }

        public int peek(){
            return stack[top];
        }

    }

    public static void main(String[] args) {
        QueueWithStack queueWithStack= new QueueWithStack();
        queueWithStack.enqueue(4);
        queueWithStack.enqueue(3);
        queueWithStack.enqueue(8);
        queueWithStack.enqueue(1);
        System.out.println(queueWithStack.dequeue());
        System.out.println(queueWithStack.dequeue());
        queueWithStack.enqueue(6);
        queueWithStack.enqueue(0);
        queueWithStack.enqueue(9);
        System.out.println(queueWithStack.dequeue());
    }

}
