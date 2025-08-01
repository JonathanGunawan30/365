import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int[] nums = {
                6,5,5
        };
        System.out.println(majorityElements(nums));
    }

    public static int majorityElements(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map.Entry<Integer, Integer> maxEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).orElse(null);

        return maxEntry.getKey();

    }
}
