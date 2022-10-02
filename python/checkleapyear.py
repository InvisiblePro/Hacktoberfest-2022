# importing the module
import calendar

# input the year 
year=int(input('Enter the value of year: '))
leap_year=calendar.isleap(year)

# checking leap year
if leap_year: # to check condition
    print('The given year is a leap year.')
else:
    print('The given year is a non-leap year.')
