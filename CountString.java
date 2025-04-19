import java.util.HashSet;
import java.util.Set;
public class CountString {
    public void processString(String str) {
        char[] arr = str.toCharArray();
        Set<String> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            result.add(arr[i]+ " = " + count);
        }

        for(String rs : result){
            System.out.println(rs);
        }
    }

    public static void main(String[] args) {
        CountString obj = new CountString();

        obj.processString("aabbcdee");

    }
}
