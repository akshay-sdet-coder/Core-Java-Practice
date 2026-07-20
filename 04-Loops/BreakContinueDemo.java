public class BreakContinueDemo {
    public static void main(String[] args) {
        System.out.println("Using break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) break;
            System.out.println(i);
        }

        System.out.println("Using continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}
