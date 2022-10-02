class FactorialExample2{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;      
  fact = factorial(int number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
} 
