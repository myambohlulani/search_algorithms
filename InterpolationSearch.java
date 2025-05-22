// implementation of Interpolation Search
// Myambo Hlulani
// 21 May 2025
// time-complexity -> O(log(log n))

public class InterpolationSearch {

    public static int search(int[] array, int target, int left_pointer, int right_pointer) {
        // if it is out of bound
        if (left_pointer > right_pointer || target > array[right_pointer] || target < array[left_pointer]) {
            return -1;
        }

        // handling ZeroDivisionError
        if (array[left_pointer] == array[right_pointer]) {
            return array[left_pointer] == target ? left_pointer : -1;
        }

        int middle = left_pointer + ((right_pointer - left_pointer) * (target - array[left_pointer]))
                / (array[right_pointer] - array[left_pointer]);

        // checking if the middle value is equal to the target
        if (array[middle] == target) {
            return middle;
        }

        // if target is less than middle value then shift right pointer into middle
        // index sub 1
        if (array[middle] > target) {
            return search(array, target, left_pointer, middle - 1);
        }

        // shifting the left pointer to middle index + 1 since the target is greater
        // than middle value
        return search(array, target, middle + 1, right_pointer);
    }

    public static void main(String[] args) {
        // array to be searched
        int[] array = { 10, 20, 30, 40, 50, 60, 500, 1000, 2000, 10000, 1111111 };

        // test cases
        System.out.println(search(array, 20, 0, array.length - 1)); // output = 1
        System.out.println(search(array, 0, 0, array.length - 1)); // output = -1
        System.out.println(search(array, 10, 0, array.length - 1)); // output = 0
        System.out.println(search(array, 1111111, 0, array.length - 1)); // output = 10
        System.out.println(search(array, 500, 0, array.length - 1)); // output = 6
    }
}
