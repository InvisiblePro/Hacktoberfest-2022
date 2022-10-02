import random
import sys
a = 1
Score = 0
print("""
Rules : 
        Player should enter number below 10.
        The score will be displayed at the ending of the game
        When the player and computer plays the same number thus it is counted as OUT""")
xyz = input(f"\n Ready for the game??? Hit enter to start...")

while a == 1:
    User = int(input("\nEnter your number : "))
    Comp = int(random.randint(0, 10))
    Score = Score+User
    if User == Comp:
        print("Opps.. !!OUT!!")
        print("Total runs : ", Score)
        a = 1
        if Score >= 50 and Score <= 99:
            a = 2
        if Score > 100:
            a = 3
        if a == 2:
            print("Congratulations for your half-century!")
            a = 0
            break
        if a == 3:
            print("Congratulations for your century!")
            a = 0
            break

        break
        sys.exit()

    if User > 10:
        print("Enter number below 10..")
        a = 0
    print("Computer's number : ", Comp, "\n")
