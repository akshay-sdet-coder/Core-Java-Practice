public class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        int age = 25;
        boolean hasID = true;
        if (age >= 18 && hasID) {
            System.out.println("Eligible to vote");
        }
    }
}
