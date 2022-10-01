import time
user_plays = True
while user_plays:
    print("Welcome to the tip calculator!")
    bill = float(input("What was the total bill? $\n"))
    tip = int(input("How much tip would you like to give? 10, 12, or 15?\n"))
    people = int(input("How many people to split the bill?\n"))

    tip_as_percent = tip / 100
    total_tip_amount = bill * tip_as_percent
    total_bill = bill + total_tip_amount
    bill_per_person = total_bill / people
    final_amount = round(bill_per_person, 2)

    print(f"Each person should pay: ${final_amount}\n")
    user_choice = input("Sir Do You Want To Calculate it Again??").lower()
    if user_choice == 'y':
        user_plays = True
        continue
    elif user_choice == 'n':
        print("Good Byee!")
        user_plays = False
        break
    else:
        print("Invalid Command, Please Try Again!")
        time.sleep(5)
        user_plays = False
