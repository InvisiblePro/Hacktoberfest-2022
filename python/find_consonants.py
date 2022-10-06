#  function of count consonants in a string
def count_consonant(input_str):
    if input_str == "":
        return 0
    if input_str[0].lower() not in vowels and input_str[0].isalpha():
        return 1 + count_consonant(input_str[1:])
    else:
        return count_consonant(input_str[1:])


# driver code
input_str = input()  # assjdsjio
vowels = "aeiou"
print(count_consonant(input_str))  # 6
