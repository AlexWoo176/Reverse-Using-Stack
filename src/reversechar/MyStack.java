package reversechar;

public class MyStack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public MyStack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char i) {
        stackArray[++top] = i;
    }
    public char pop() {
        return stackArray[top--];
    }
    public char peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
