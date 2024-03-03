package DataStructure;

import java.util.Arrays;

class MyStack{

    private String []arr;
    private int top;

    public MyStack(int size){
        arr=new String[size];
        top=-1;
    }

    public void push(String val) {
        if(top==arr.length-1){
            throw new StackOverflowError("stack size is "+(top+1));
        }
        top++;
        arr[top]=val;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                ", top=" + top +
                '}';
    }

    public void pop() {
        arr[top]=null;
        top--;
    }
//    public void
}

public class CapgeminiInterview {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push("apple");
        myStack.push("appldd");myStack.push("afgple");myStack.push("apfddfle");
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);

    }


}
