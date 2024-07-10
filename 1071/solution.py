#Leetcode 1071 GCD of Strings

import math


def gcdOfStrings(str1: str, str2: str) -> str:
    if str1 + str2 != str2 + str1:
        return ""
    gcd = math.gcd(len(str1), len(str2))
    return str1[:gcd]


if __name__ == "__main__":
    print(gcdOfStrings("ABCABC", "ABC"))
    print(gcdOfStrings("ABABAB", "ABAB"))
    print(gcdOfStrings("LEET", "CODE"))
