# implementation of binary_search using recursion
# Hlulani Myambo
# 20 May 2025
# time complexity -> O(log n)

def binary_search(array: list[int], target: int, left_pointer: int, right_pointer:int) -> int:
    middle_index = (left_pointer + right_pointer) // 2

    # out of bound
    if left_pointer > right_pointer:
        return -1
    # if middle value is == target
    if array[middle_index] == target:
        return middle_index
    # middle value greater than target
    if array[middle_index] > target:
        return binary_search(array, target, left_pointer, middle_index - 1)
    # middle value less than the target
    if array[middle_index] < target:
        return binary_search(array, target, middle_index + 1, right_pointer)

test_case: list[int] = list(range(10, 200))
target: int = 20
LEFT_POINTER: int = 0
RIGHT_POINTER: int = len(test_case) - 1

print(binary_search(test_case, target, LEFT_POINTER, RIGHT_POINTER)) #output = 10
print(binary_search(test_case, 59, LEFT_POINTER, RIGHT_POINTER)) #output = 49
print(binary_search(test_case, 200, LEFT_POINTER, RIGHT_POINTER)) #output = -1
print(binary_search(test_case, 199, LEFT_POINTER, RIGHT_POINTER)) #output = 189
print(binary_search(test_case, 2025, LEFT_POINTER, RIGHT_POINTER)) #output = -1
print(binary_search(test_case, 10, LEFT_POINTER, RIGHT_POINTER)) #output = 0
print(binary_search(test_case, 49, LEFT_POINTER, RIGHT_POINTER)) #output = 39
