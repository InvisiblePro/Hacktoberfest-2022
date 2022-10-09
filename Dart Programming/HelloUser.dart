import 'dart:io';
void main()
{
  print("Enter your name:");
  String ? name =stdin.readLineSync();
  print("Enter your gender:");
  String ? gender=stdin.readLineSync();
  print("Enter your age:");
  int ? age=int.parse(stdin.readLineSync()!);
  print("Hey $name");
  stdout.write("Your Gender: $gender\n");
  stdout.write("Your Age: $age");
}