sentence = input("Enter sentence: ")
word = input("Enter the word you want to find location: ")
word_positions = []

sentence_list = enumerate(sentence.lower().split())
for i, each_word in sentence_list:
    if each_word == word:
        word_positions.append(str(i))
if len(word_positions) == 0:
    print("\"" + word + "\" is not found in the sentence")
else:
    result = ", ".join(list(word_positions))
    print("Location of \"" +  word + "\" is " + result)

