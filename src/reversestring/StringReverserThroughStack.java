package reversestring;

public class StringReverserThroughStack {
    private String input;
    private String ouput;

    public StringReverserThroughStack(String in) {
        input = in;
    }
    public String doReverse() {
        int stackSize = input.length();
        MyStack myStack = new MyStack(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            myStack.push(charAt);
        }
        ouput = "";
        while (!myStack.isEmpty()) {
            char charAt = myStack.pop();
            ouput = ouput + charAt;
        }
        return ouput;
    }
}
