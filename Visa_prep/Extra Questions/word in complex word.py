def split_camel_case(s):
    res = []
    current = ""
    for char in s:
        if char.isupper() and current:  # Start of a new word
            res.append(current)
            current = char  # Start a new component
        else:
            current += char
    # Append the last word
    if current:
        res.append(current)
    return res

def is_composed_of_words(word_list, camel_case_word):
    # Split the camelCase word into components
    components = split_camel_case(camel_case_word)
    # Normalize to lowercase for comparison
    components = [word.lower() for word in components]
    word_list = [word.lower() for word in word_list]
    
    # Check if all words in the word list are in components
    for word in word_list:
        if word not in components:
            return False
    return True

# Example Usage
camel_case_word = input("Complex camelCase word: ")
word_list = input("List of words (separated by spaces): ").split()
result = is_composed_of_words(word_list, camel_case_word)
print(result)
