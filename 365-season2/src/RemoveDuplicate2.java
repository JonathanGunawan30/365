public class RemoveDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {
                0,0,1,1,1,1,2,3,3
        };

        System.out.println(removeDuplicates(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(var num : nums){
            if(i == 0 || i == 1 || nums[i - 2] != num){
                nums[i] = num;
                i ++;
            }
        }

        return i;

    }
}
