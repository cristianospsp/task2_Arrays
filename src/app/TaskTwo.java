package app;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        // Input data.
        Scanner scanner = new Scanner(System.in);

        // Read data.
        System.out.print("Type anything: ");
        // Read a line String from input
        String input = scanner.nextLine();

        // breal in Char[]
        char[] charArray = input.toCharArray();

        // print original charArray
        System.out.println("Original Array: " + formatArray(charArray));

        // Sort charArry
        Arrays.sort(charArray);
        System.out.println("Sorted Array: " + formatArray(charArray));

        // Trasnform charArray in String
        String finalString = new String(charArray);
        // final print string odered
        System.out.println("Final String: " + finalString);

        // close
        scanner.close();
    }

    // Formatter
    private static String formatArray(char[] array) {
        return Arrays.stream(new String(array).split(""))
                .map(c -> c.equals(" ") ? " " : c) // Space adjustment
                .toList()
                .toString()
                .replace("[", "{ ")
                .replace("]", " }");
    }
}
