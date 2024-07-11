def kidsWithCandies(candies: list[int], extraCandies: int) -> list[bool]:
    resultList = []

    highestNum = max(candies)
    for candy in candies:
        if candy + extraCandies >= highestNum:
            resultList.append(True)
        else:
            resultList.append(False)
    return resultList

if __name__ == "__main__":
    print(kidsWithCandies([2,3,5,1,3], 3))