public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Java Programming  ";
        System.out.println("Trimmed: [" + str.trim() + "]");
        System.out.println("Contains Java: " + str.contains("Java"));
        System.out.println("Replace: " + str.replace("Java", "Core Java"));
        System.out.println("Substring: " + str.trim().substring(0, 4));
        System.out.println("Split: " + java.util.Arrays.toString(str.trim().split(" ")));
    }
}
