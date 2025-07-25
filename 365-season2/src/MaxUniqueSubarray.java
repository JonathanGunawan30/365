public class MaxUniqueSubarray {
    public static void main(String[] args) {

        int[] arr = {
                -1, -15
        };

        System.out.println(maxSum(arr));


    }

    public static int maxSum(int[] nums) {
        if(nums.length == 1) return nums[0];

        int result = 0, count = 0, min = 0, maxMin = -100000;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                for(int j = i; j < nums.length; j++){
                    if(nums[i] == nums[j]) count++;
                    if(count >= 2) break;
                }
                if(count <= 1) result += nums[i];
                count = 0;
            } else {
                min++;
            }
        }

        if(nums.length == min){
            for (int i = 0; i < nums.length; i++) {
                if(maxMin < nums[i] ){
                    maxMin = nums[i];
                }
            }
            return maxMin;
        }

        return result;

    }
}
