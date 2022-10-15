import time
from socket import AF_INET, SOCK_STREAM, socket
from getpass import getpass
from os import system

HOST = '127.0.0.1'
PORT = 50000
AUTHORIZED = "Successfully authenticated! Welcome to our system :D"

clear = lambda: system('clear')

connection = socket(AF_INET, SOCK_STREAM)
connection.connect((HOST, PORT))
print("Connecting with the server")


def send_login():
    login = input("Enter your login: ")
    connection.send(login.encode())


def send_password():
    password = getpass("Enter your password: ")
    connection.send(password.encode())


def menu():
    clear()
    print('=' * 30)
    print("{:^30}".format("OPERATIONS MENU"))
    print('=' * 30)
    print('Options:')
    print('1 - Extract')
    print('2 - Deposit')
    print('3 - Withdraw')
    print('4 - Exit')
    print('=' * 30)
    print('=' * 30)


def condition(press):
    if press == 'X' or press == 'x':
        exit()
    else:
        menu()


while True:
    send_login()
    send_password()

    answer = connection.recv(2048)
    print("Server: ", answer.decode('UTF-8'))

    if answer.decode() == AUTHORIZED:
        time.sleep(1.5)
        menu()
        while True:
            option = input('Enter the desired option: ')
            if option == '1':
                connection.send(option.encode())
                msg = connection.recv(2048).decode('UTF-8')
                print(msg)
                print()
                print("Press ENTER to return to the MENU or (X and ENTER) to quit: ")
                press = input()
                condition(press)
            elif option == "2":
                connection.send(option.encode())
                print("Enter the deposit amount: ")
                value = input()
                connection.send(value.encode())
                msg2 = connection.recv(2048).decode("UTF-8")
                print(msg2)
                print("Press ENTER to return to the MENU or (X and ENTER) to quit: ")
                press = input()
                condition(press)
            elif option == "3":
                connection.send(option.encode())
                print("Enter the amount you want to withdraw: ")
                value = input()
                connection.send(value.encode())
                msg3 = connection.recv(2048).decode("UTF-8")
                print(msg3)
                print("Press ENTER to return to the MENU or (X and ENTER) to quit: ")
                press = input()
                condition(press)
            elif option == "4":
                print("Press ENTER to return to the MENU or (X and ENTER) to quit: ")
                press = input()
                condition(press)
            else:
                print("Invalid option")
                continue