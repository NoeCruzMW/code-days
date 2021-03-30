"""
Write a function that takes a string of braces, and determines if the order of the braces is valid. 
It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], 
and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, 
brackets and curly braces: ()[]{}.

What is considered Valid?

A string of braces is considered valid if all braces are matched with the correct brace.

```
"(){}[]"   =>  True
"((){}[])"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False
```

"""


def hasBetween(table: dict, tk):
    for token in table.keys():
        if token != tk and len(table[token]) != 0:
            for in_tk in table[token]:
                if in_tk > table[tk][len(table[tk]) - 1]:
                    return True
    return False


def process(table, tk):
    if len(table[tk]) == 0:
        return False, None
    if hasBetween(table, tk):
        return False, None
    if len(table[tk]) > 0:
        cx = table[tk]
        cx.pop()
        table[tk] = cx
    return True, table


def validBraces2(string):
    o_tkns = ["(", "{", "["]
    c_tkns = [")", "}", "]"]
    table = {o_tkns[0]: [], o_tkns[1]: [], o_tkns[2]: []}
    for i, token in enumerate(string):
        if token in c_tkns:
            next, table = process(table, o_tkns[c_tkns.index(token)])
            if next:
                table = table
                continue
            return next
        table[token].append(i)
    for tkn in o_tkns:
        if table[tkn]:
            return False
    return True

def validBraces(string):
    braces = {"(": ")", "[": "]", "{": "}"}
    stack = []
    for character in string:
        if character in braces.keys():
            stack.append(character)
        else:
            if len(stack) == 0 or braces[stack.pop()] != character:
                return False
    return len(stack) == 0

if __name__ == "__main__":
    print(validBraces("[(){}[]]"))
    print(validBraces("((){}[])"))
    print(validBraces("([{}])"))
    print(validBraces("(}"))
    print(validBraces("[(])"))
    print(validBraces("[({})](]"))