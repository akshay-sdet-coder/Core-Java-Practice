public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Selenium Automation";
        int vowels = 0, consonants = 0;

        String lower = str.toLowerCase();
        for (char ch : lower.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
