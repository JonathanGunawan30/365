import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {
                0,0,1,1,1,2,2,3,3,4
        };
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        int count = 0;
        boolean isAdd;
        for (int i = 0; i < nums.length; i++) {
            isAdd = sortedSet.add(nums[i]);
            if(isAdd){
                nums[count] = sortedSet.getLast();
                count ++;
            }

        }


        return count;
    }
}
