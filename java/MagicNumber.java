
// Java program to check if
// a number is Magic number.
import java.util.*;

class MagicNumber {
    public static boolean isMagic(int n) {
        int sum = 0;

        // Note that the loop continues
        // if n is 0 and sum is non-zero.
        // It stops when n becomes 0 and
        // sum becomes single digit.
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }

        // Return true if sum becomes 1.
        return (sum == 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (isMagic(n))
            System.out.println("Magic Number");

        else
            System.out.println("Not a magic Number");
    }
}
