# implementation of interpolation search
# This is an enhance version of binary search
# Myambo Hlulani
# 20 May 2025
# Time complexity -> log(log(n))

def interpolation_search(array: list[int], target: int, left_pointer: int, right_pointer: int) -> int:
    # calculate for middle index
    middle_pointer = left_pointer + ((right_pointer - left_pointer) * (target - array[left_pointer]))// (array[right_pointer] - array[left_pointer])

    if left_pointer > right_pointer or array[left_pointer] == array[right_pointer] or middle_pointer > right_pointer:
        return -1
    if array[middle_pointer] == target:
        return middle_pointer
    if array[middle_pointer] < target:
        return interpolation_search(array, target, middle_pointer + 1, right_pointer)
    if array[middle_pointer] > target:
        return interpolation_search(array, target, left_pointer, middle_pointer - 1)

test_case: list[int] = [10, 13, 15, 16, 18, 19, 27, 28, 30, 32, 34, 39, 43, 45, 50]
LEFT = 0
RIGHT: int = len(test_case) - 1
TARGET: int = 10

print(interpolation_search(test_case, TARGET, LEFT, RIGHT)) # output = 0
print(interpolation_search(test_case, 0, LEFT, RIGHT)) # output = -1
print(interpolation_search(test_case, 30, LEFT, RIGHT)) # output = 8
print(interpolation_search(test_case, 50, LEFT, RIGHT)) # output = 14
print(interpolation_search(test_case, 27, LEFT, RIGHT)) # output = 6
print(interpolation_search(test_case, 200, LEFT, RIGHT)) # output = -1
