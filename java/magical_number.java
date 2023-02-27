import java.util.Scanner;  
public class MagicNumberExample1  
{  
public static void main(String args[])  
{  
int n, remainder = 1, number, sum = 0;  
//creating a constructor of the Scanner class  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number you want to check: ");  
//reading an integer form the user  
n = sc.nextInt();  
//assigning the entered number in the variable num  
number = n;  
//outer while loop  
while (number > 9)               //while(number > 0 || sum > 9)  
{  
//inner while loop      
while (number > 0)  
{  
//determines the remainder      
remainder = number % 10;   
sum = sum + remainder;  
//divides the number by 10 and removes the last digit of the number  
number = number / 10;     
}  
number = sum;  
sum = 0;  
}  
if (number == 1)  
{  
System.out.println("The given number is a magic number.");  
}  
else  
{  
System.out.println("The given number is not a magic number.");  
}  
}  
}  
Output 1:

Enter a number you want to check: 325
The given number is a magic number.
Output 2:

Enter a number you want to check: 891
The given number is a magic number.
Let's see another logic to check the magic number.

MagicNumberExample2.java

import java.util.Scanner;  
public class MagicNumberExample2  
{  
public static void main(String args[])  
{  
Scanner scanner = new Scanner(System.in);      
System.out.print("Enter any number to check: ");  
//reading an iteger from the user  
int number = scanner.nextInt();  
if(magicNumber(number))  
System.out.println(number +" is a magic number.");  
else  
System.out.println(number +" is not a magic number.");  
}  
//user-defined method to check the number is magic or not  
public static boolean magicNumber(int number)  
{  
if( ((number - 1) % 9) == 0)  
return true;  
else  
return false;  
}  
}  
