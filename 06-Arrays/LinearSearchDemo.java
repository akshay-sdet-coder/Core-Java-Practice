public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 67, 89};
        int key = 67;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(key + " found at index: " + index);
    }
}
