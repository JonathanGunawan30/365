public class Subsequence {
    public static void main(String[] args) {

        System.out.println(isSubsequence("abc", "xxxaxxxbxxxc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int index = 0;

        for (char c : s.toCharArray()) {
            int found = t.indexOf(c, index);

            if (found == -1) {
                return false;
            }

            index = found + 1;
        }

        return true;
    }

}
