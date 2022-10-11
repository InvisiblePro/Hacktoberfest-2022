import secrets
import string
import bcrypt

# define alphabet
letters = string.ascii_letters
digits = string.digits
special_chars = string.punctuation

alphabet = letters + digits + special_chars

def generate_password():
    while True:
        try:
            pwd_length = int(input("How long would you like your password to be? "))
        except ValueError:
            print("Please, enter a valid integer")
            continue
        else:
            print(f'You entered: {pwd_length}')
            break

    while True:
        pwd = ''
        for i in range(pwd_length):
            pwd += ''.join(secrets.choice(alphabet))

        if (any(char in special_chars for char in pwd) and
            sum(char in digits for char in pwd)>=2):
                break
    print(pwd)

    bytePwd = pwd.encode('utf-8')

    salt = bcrypt.gensalt()
    hashed = bcrypt.hashpw(bytePwd, salt)

    pwCheck = bcrypt.checkpw(bytePwd, hashed)
    if (pwCheck == True) :
        print("The password was successfully hashed") 
    elif (pwCheck == False) :
        print("The password can't be hashed")

    print(hashed)

option = input("Do you want to generate a password? (Yes/No): ")

if option == "Y":
    generate_password()
elif option == "Yes":
    generate_password()
else:
    print("Program ended")
