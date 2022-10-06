Steps to check PalPrime number
In order to check whether the number is PalPrime or not, we have to follow the following steps:

Get a number from the user to check whether it is PalPrime or not.
We store that number in a temporary variable so that the original value remains the same.
We use the "for loop" to check whether the number is prime or not.
We also check whether the number is palindrome or not.
If the number is both Prime and Palindrome, print "number is a PalPrime number.".
If not, then print "number is not a PalPrime number.".
Let's implement the code to check whether the number is a PalPrime number or not.

//import required classes and packages  
import java.io.*;  
import java.util.*;  
  
//create PalPrimeNumber class to check whether the given number is a PalPrime number or not  
class PalPrimeNumber  
{     
    //main() method start  
    public static void main(String args[])  
    {  
        //create scanner class object to get input from user  
        Scanner sc = new Scanner(System.in);  
          
        //declare and initialize variables   
        int number, temp, rem, i;  
        int count = 0;  
        int sum = 0;  
          
        System.out.println("Enter number to check");  
        //get input from user  
        number = sc.nextInt();  
          
        //store number in a temporary variable temp  
        temp = number;  
          
        //use for loop check whether number is prime or not  
        for(i = 1; i <= temp; i++)  
        {  
            if(temp%i == 0)  
            {  
                count++;    //increment counter when the reminder is 0  
            }  
        }  
          
        //use while loop to check whether the number is palindrome or not  
        while(number > 0)  
        {  
            // get last digit of the number  
            rem = number%10;  
              
            // store the digit last digit  
            sum = sum*10+rem;   
              
            // extract all digit except the last  
            number = number/10;   
        }  
          
        //check whether the number is palindrome and Prime or not  
        if(temp == sum && count == 2)  
        {  
            System.out.println(temp +" is a PalPrime number");  
        }  
        else  
        {  
            System.out.println(temp +" is not a PalPrime number");  
        }  
    }  
}  
