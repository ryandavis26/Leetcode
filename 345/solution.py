def reversevowels(s):
    vowels = set("aeiouAEIOU")
    beginIndex = 0
    endIndex = len(s) - 1
    s = list(s)

    while beginIndex < endIndex:
        if s[beginIndex] in vowels and s[endIndex] in vowels:
            temp = s[beginIndex]
            s[beginIndex] = s[endIndex]
            s[endIndex] = temp
            beginIndex = beginIndex + 1
            endIndex = endIndex - 1
        elif s[beginIndex] in vowels:
            endIndex = endIndex - 1
        elif s[endIndex] in vowels:
            beginIndex = beginIndex + 1
        else:
            beginIndex = beginIndex + 1
            endIndex = endIndex - 1
    return "".join(s)

if __name__ == '__main__':
    print(reversevowels("Hello"))