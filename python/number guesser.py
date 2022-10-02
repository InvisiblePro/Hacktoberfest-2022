# A number guessing game in python

import random

number=random.randint(1,10)
guesses=0
guess=0

print("I'm thinking of a number from 1 to 10, what can it be?\n")

while 1:
    guess=int(input("The number is: "))
    if guess==number:
        guesses+=1
        print("Correct!")
        print(f"You took {guesses} tries!")
        break
    else:
        guesses+=1
        print("Incorrect!\n")
