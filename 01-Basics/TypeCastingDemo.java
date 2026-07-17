public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit casting (widening) - smaller to larger type
        int num = 100;
        double implicitCast = num;
        System.out.println("Implicit casting (int to double): " + implicitCast);

        // Explicit casting (narrowing) - larger to smaller type
        double price = 99.99;
        int explicitCast = (int) price;
        System.out.println("Explicit casting (double to int): " + explicitCast);

        // char to int
        char ch = 'A';
        int charToInt = ch;
        System.out.println("Char 'A' to int (ASCII value): " + charToInt);
    }
}