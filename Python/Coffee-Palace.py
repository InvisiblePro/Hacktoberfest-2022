class Customers:
    greeting = "Welcome to Coffee Palace"

    def __init__(self, Name, Beverage, Food, Total):
        self.Name = Name
        self.Beverage = Beverage
        self.Food = Food
        self.Total = Total

c_1 = Customers("George", "Expresso", "Pastrami on rye", 220)
c_2 = Customers("Max", "Strawberry frappucino", "Tuna Wrap", 270)
c_3 = Customers("Lewis", "Iced coffee latte", "Cinnamon roll", 225)
c_4 = Customers("Mich", "Caramel macchiato", "Glazed doughnut", 230)
c_5 = Customers("Fernando", "Iced tea", "Blueberry pancakes", 315)

print(Customers.greeting) #Welcome to Coffee Palace
print(c_2.Name) #Max
print(c_2.Beverage) #Strawberry frappucino
print(c_1.Food) #Pastrami on rye
print(c_1.Total) #220
print(c_4.Name) #Mich
print(c_3.Beverage) #Iced coffee latte
print(c_3.Food) #Cinnamon roll
print(c_4.Total) #230
