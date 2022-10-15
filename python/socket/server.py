from socket import *


class Account:
    def __init__(self, client, password, agency, account_number, balance):
        self.client = client
        self.password = password
        self.agency = agency
        self.account_number = account_number
        self.balance = balance


person = Account('hywenklis', '1234', '0001', '1010-2', 0)

HOST = 'localhost'
PORT = 50000

sockobj = socket(AF_INET, SOCK_STREAM)
sockobj.bind((HOST, PORT))
sockobj.listen(1)
print("Waiting for a client to connect")


def authenticating_client():
    FAILURE = True
    decoded_login = recover_customer_login()
    decoded_password = recover_customer_password()
    while FAILURE:
        if decoded_login != person.client or decoded_password != person.password:
            print(f"Client: login={decoded_login} password={decoded_password}")
            not_authorized = "Could not connect, try again."
            connection.send(not_authorized.encode())
            authenticating_client()
        else:
            print(f"Client: login={decoded_login} password={decoded_password}")
            authorized = "Successfully authenticated! Welcome to our system :D"
            connection.send(authorized.encode())
        break


def send_command(connection, command):
    command += '\r\n'
    connection.send(command.encode('UTF-8'))


def recover_customer_login():
    login_client = connection.recv(1024)
    decoded_login = login_client.decode()
    return decoded_login


def recover_customer_password():
    password_client = connection.recv(1024)
    decoded_password = password_client.decode()
    return decoded_password


def retrieve_client_option():
    option = connection.recv(1024)
    decoded_option = option.decode()
    return decoded_option


def recover_value_of_deposit():
    deposit_value = connection.recv(1024)
    decoded_deposit_value = deposit_value.decode()
    return float(decoded_deposit_value)


def retrieve_withdrawal_value():
    value_to_withdraw = connection.recv(1024)
    decoded_value_to_withdraw = value_to_withdraw.decode()
    return float(decoded_value_to_withdraw)


def extract(self):
    send_command(connection, f"your balance is: ${self.balance}")


def deposit(value):
    person.balance += value
    send_command(connection, "Deposit made!")


def to_withdraw(value):
    if value <= person.balance:
        person.balance -= value
        send_command(connection, "Withdrawal carried out!")
    else:
        send_command(connection, 'Insufficient balance.')


def closing_connection():
    exit()


def connection_client_server():
    while True:
        global connection
        connection, ip_address = sockobj.accept()
        print("Connected in", ip_address)
        authenticating_client()
        while True:
            option = retrieve_client_option()
            if option == "1":
                extract(person)
            elif option == "2":
                deposit_value = recover_value_of_deposit()
                deposit(deposit_value)
            elif option == "3":
                withdrawal_value = retrieve_withdrawal_value()
                to_withdraw(withdrawal_value)
            else:
                print("Closing connection!")
                closing_connection()


connection_client_server()