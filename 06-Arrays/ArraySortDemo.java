import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 3, 67};
        System.out.println("Before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
