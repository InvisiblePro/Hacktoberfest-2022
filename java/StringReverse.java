import java.io.*;
import java.util.Scanner;
  
class Rev {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("Using default input: \"The quick brown fox jumped over the lazy dog\"");
            input = "The quick brown fox jumped over the lazy dog";
        }

        long startTime = System.nanoTime();
        System.out.println("Using conventional method: \"" + conventionalReverse(input) + "\" took " + (System.nanoTime() - startTime) + "ns");

        startTime = System.nanoTime();
        System.out.println("Using char array combined with StringBuilder: \"" + reverseWithCharArray(input) + "\" took " + (System.nanoTime() - startTime) + "ns");

        startTime = System.nanoTime();
        System.out.println("Using in-built method: \"" + reverseWithBuilder(input) + "\" took " + (System.nanoTime() - startTime) + "ns");
      
        sc.close();
    }

    public static String conventionalReverse(String input) {
        String nstr = "";
        char ch;

        for (int i=0; i<input.length(); i++)
        {
            ch= input.charAt(i); //extracts each character
            nstr= ch + nstr; //adds each character in front of the existing string
        }

        return nstr;
    }

    public static String reverseWithBuilder(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();   //Using in-built reverse function
        return sb.toString();
    }

    public static String reverseWithCharArray(String input) {
        StringBuilder reverse = new StringBuilder();     //Using StringBuilder as it is much more memory efficient
        char[] letters = input.toCharArray();       //converting input String to array of characters

        //Traversing through the array in reverse and appending to the result
        int index = letters.length - 1;
        while (index >= 0) {
            reverse.append(letters[index--]);
        }
        return reverse.toString();
    }
}
