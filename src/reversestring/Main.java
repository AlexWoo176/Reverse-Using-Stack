package reversestring;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String input;
        String ouput;
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        StringReverserThroughStack theReveresr = new StringReverserThroughStack(input);
        ouput = theReveresr.doReverse();
        System.out.println("Reversed: " + ouput);
    }
}
