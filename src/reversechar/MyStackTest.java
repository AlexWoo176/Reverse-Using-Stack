package reversechar;

import java.util.Scanner;

public class MyStackTest {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stackSize = input.length();
        MyStack myStack = new MyStack(stackSize);

        for (int i = 0; i <input.length(); i++) {
            char ch = input.charAt(i);
            myStack.push(ch);
        }

        while (! myStack.isEmpty()) {
            char ch = myStack.pop();
            System.out.print(ch);
        }
    }
}
