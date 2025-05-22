// Linear Search using recursion
// Myambo Hlulani
// 22 May 2025
// => time-complexity -> O(n)
// => as input increases, time to process it increases

public class LinearSearch {
    public static int search(int[] array, int target, int index) {
        if (array.length == 0) {
            return -1;
        }

        if (array.length - 1 >= index) {
            if (array[index] == target) {
                return index;
            }
            return search(array, target, index + 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ARRAY = { 10, 20, 30, 40, 50 };
        int target = 10;
        int INDEX = 0;

        // Test cases
        System.out.println(search(ARRAY, target, INDEX)); // output = 0
        System.out.println(search(ARRAY, 0, INDEX)); // output = -1
        System.out.println(search(ARRAY, 30, INDEX)); // output = 2
        System.out.println(search(ARRAY, 50, INDEX)); // output = 4
        System.out.println(search(ARRAY, 60, INDEX)); // output = -1
    }
}