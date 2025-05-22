// Binary Search recursively
// Myambo Hlulani
// 21 May 2025
// time-complexity -> O(log n)

public class BinarySearch {
    public static int binarySearch(int[] array, int target, int left_pointer, int right_pointer) {
        // targeting the middle value by finding it's index
        int middle = (left_pointer + right_pointer) / 2;

        // if out of bound then return index of where the value would be if it were to
        // be added
        if (left_pointer > right_pointer) {
            return -1;
        }

        // check if the middle value is equal to the target
        if (array[middle] == target) {
            return middle;
        }

        // checking if the middle value is greater than the target
        if (array[middle] > target) {
            // recursive call moving the right index into middle - 1
            return binarySearch(array, target, left_pointer, middle - 1);
        }

        // recursive call moving the left pointer if middle value is lesser than target
        return binarySearch(array, target, middle + 1, right_pointer);
    }

    public static void main(String[] args) {
        // sorted array to search for the target
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // pointers
        int LEFT = 0;
        int RIGHT = numbers.length - 1;

        // test cases
        System.out.println(binarySearch(numbers, 10, LEFT, RIGHT)); // output = -1
        System.out.println(binarySearch(numbers, 1, LEFT, RIGHT)); // output = 0
        System.out.println(binarySearch(numbers, 5, LEFT, RIGHT)); // output = 4
        System.out.println(binarySearch(numbers, 9, LEFT, RIGHT)); // output = 8
    }
}
