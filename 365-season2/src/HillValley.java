public class HillValley {
    public static void main(String[] args) {
        int[] array = {
                57,57,57,57,57,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,90,85,85,85,86,86,86
        };
        System.out.println(countHillValley(array));
    }

    public static int countHillValley(int[] nums){
        if(nums.length < 3)return 0;

        int count = 0, front = 1;

        for (int i = 1; i < nums.length - 1; i++) {

            while(nums[i] == nums[i + front]){
                if(i + front > nums.length - 2) return count;
                front ++;
            }

            if((nums[i] > nums[i + front] && nums[i] > nums[i - 1]) || (nums[i] < nums[i + front] && nums[i] < nums[i - 1])){
                count++;
            }

            front = 1;
        }


        return count;
    }
}
