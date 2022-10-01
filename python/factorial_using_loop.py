# Python Program to find Factorial of a Number using While Loop

value = int(input(" Please enter any Value : "))
fact = 1
i = 1

while(i <= value):
    fact = fact * i
    i = i + 1

print("The Result of %d  = %d" %(value, fact))
