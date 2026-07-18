public class TernaryOperatorPractice {
    public static void main(String[] args) {
        int num = 45;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + result);

        int a = 10, b = 20;
        int greater = (a > b) ? a : b;
        System.out.println("Greater number: " + greater);
    }
}
