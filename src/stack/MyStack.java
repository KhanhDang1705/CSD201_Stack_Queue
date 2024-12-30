package stack;


public class MyStack {
    private Node top;
    private int length;

    public MyStack() {
        this.top = null;
        this.length = 0;
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        Node newNode  = new Node(data);
        newNode.setNext(top);
        top = newNode;
        length++;
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("Khong");
            return;
        }
        int value = top.getData();
        top = top.getNext();
        length--;
        System.out.println(value);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Stack: " + myStack.getLength());
        myStack.pop();
        System.out.println("Stack: " + myStack.getLength());
    }
}
