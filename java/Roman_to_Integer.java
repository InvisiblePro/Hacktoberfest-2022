import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a roman number: ");
        String roman = sc.nextLine();
        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);
    }
    private static int romanToInt(String roman) 
     {
        int result = 0;
        int prev = 0;
        int curr = 0;
        for (int i = roman.length() - 1; i >= 0; i--) 
        {
            curr = getValue(roman.charAt(i));
            if (curr < prev) 
            {
                result -= curr;
            } 
            else 
            {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }
    private static int getValue(char charAt) 
    {
        switch (charAt) 
        {
            case 'I':
            case 'i':
                return 1;
            case 'V':
            case 'v':
                return 5;
            case 'X':
            case 'x':
                return 10;
            case 'L':
            case 'l':
                return 50;
            case 'C':
            case 'c':
                return 100;
            case 'D':
            case 'd':
                return 500;
            case 'M':
            case 'm':
                return 1000;
            default:
                return 0;
        }
    }
}
