public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("  Hellfo Wowrld "));
    }

    public static int lengthOfLastWord(String s) {
        if(!s.contains(" ")) return s.length();

        int current = 0, temp = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' ){
                current = 0;
                continue;
            }

            current++;
            temp = current;
        }

        return temp;
    }
}
