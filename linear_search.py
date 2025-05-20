# implementation of linear search using recursion
# Hlulani Myambo
# 20 May 2025
# Time-complexity -> O(n)

def linear_search(array: list[int], target: int, length: int, index=0) -> int:
    # empty array
    if not array:
        return -1
    if array[index] == target:
        return index
    # out of bound
    if index >= length:
        return -1
    return linear_search(array, target, length, index + 1)

test_case: list[int] = [10, 78, 12, 90, 91, 50, 21, -1, 921, 200, 1, 0, 59, 96, 1000]
length: int = len(test_case) - 1
target: int = 21

print(linear_search(test_case, target, length)) #ouput = 6
print(linear_search(test_case, 20, length)) #ouput = -1
print(linear_search(test_case, 10, length)) #ouput = 0
print(linear_search(test_case, 1000, length)) #output = 14