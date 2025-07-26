import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {
                1,2
        };

        System.out.println(missingNum(arr));

    }

    public static int missingNum(int[] nums){

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i ){
                return i;
            }
        }

        return nums[nums.length - 1] + 1;
    }
}
