public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        if(s.length() == 1) return true;
        String letter1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(letter1.length() == 2 && letter1.charAt(0) != letter1.charAt(1)) return false;
        String letter2 = new StringBuilder(letter1).reverse().toString();
        return letter1.equals(letter2);
    }
}
