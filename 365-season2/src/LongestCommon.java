import java.util.Arrays;

public class LongestCommon {
    public static void main(String[] args) {
        String[] arr = {
                "flower","flow","flight"
        };

        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String first = strs[0];
        String second = strs[strs.length -1];

        int i = 0;
        while(i < first.length()){
            if(first.charAt(i) == second.charAt(i)){
                i++;
            } else {
                break;
            }
        }


        return first.substring(0, i);
    }
}
