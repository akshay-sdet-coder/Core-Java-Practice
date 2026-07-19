public class NestedIfDemo {
    public static void main(String[] args) {
        int num = 25;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is positive and even");
            } else {
                System.out.println(num + " is positive and odd");
            }
        } else {
            System.out.println(num + " is not positive");
        }
    }
}
