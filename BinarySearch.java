public class BinarySearch {
    public static int binarySearch(int[] array, int target, int left, int right) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (array[middle] == target) {
            return middle;
        }

        if (array[middle] > target) {
            return binarySearch(array, target, left, middle - 1);
        }
        return binarySearch(array, target, middle + 1, right);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int LEFT = 0;
        int RIGHT = numbers.length - 1;
        System.out.println(binarySearch(numbers, 10, LEFT, RIGHT)); // output = -1
        System.out.println(binarySearch(numbers, 1, LEFT, RIGHT)); // output = 0
        System.out.println(binarySearch(numbers, 5, LEFT, RIGHT)); // output = 4
        System.out.println(binarySearch(numbers, 9, LEFT, RIGHT)); // output = 8
    }
}