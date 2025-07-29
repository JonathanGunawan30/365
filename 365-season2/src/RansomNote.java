public class RansomNote {
    public static void main(String[] args) {

        System.out.println(canConstruct("aa", "ab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine){
        for(var value : ransomNote.toCharArray()){
            if(!magazine.contains(Character.toString(value))) {
                return false;
            }
            magazine = magazine.replaceFirst(Character.toString(value), "");
        }
        return true;
    }
}
