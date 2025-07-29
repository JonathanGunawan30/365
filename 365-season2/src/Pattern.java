import java.util.*;

public class Pattern {
    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));

    }

    public static boolean wordPattern(String pattern, String s){

        List<String> result = new ArrayList<>(Arrays.asList(s.split(" ")));
        Map<Character, String> mapST = new HashMap<>();
        Map<String, Character> mapND = new HashMap<>();

        if(result.size() != pattern.length()) return false;

        for (int i = 0; i < result.toArray().length; i++) {

            char c = pattern.charAt(i);
            String word = result.get(i);

            if (mapST.containsKey(c)) {
                if (!Objects.equals(mapST.get(c), word)) return false;
            } else {
                mapST.put(c, word);
            }

            if (mapND.containsKey(word)) {
                if (!Objects.equals(mapND.get(word), c)) return false;
            } else {
                mapND.put(word, c);
            }

        }

        return true;
    }
}
