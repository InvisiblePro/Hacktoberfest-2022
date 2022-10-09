//This Program shows how control flow works in dart.
//Program to Check whether entered number is positive ,negative , or zero.
import 'dart:io';
void main()
{
  print("Enter a number:");
  var num=int.parse(stdin.readLineSync()!);
  if(num>0)
    {
      print("Positive Number");
    }
  else if(num<0)
  {
    print("Negative Number");
  }  
  else
  {
    print("Zero");
  }
} 