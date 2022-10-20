import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args) 
    {

        Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number :");
            
        int n = scan.nextInt();
        int sum = addNumbers(n);
        scan.close();
             System.out.println("Recursive sum is " + sum);
    }

    public static int addNumbers(int n) 
    {
        if (n != 0)
            return n + addNumbers(n - 1);
        else
            return n;
    }
}
