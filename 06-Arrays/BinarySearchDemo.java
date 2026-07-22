import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 45, 67, 89};
        int key = 45;

        int result = Arrays.binarySearch(numbers, key);
        System.out.println(key + " found at index: " + result);
    }
}
