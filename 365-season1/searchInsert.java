public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums[0] > target || nums[0] == target){return 0;}
        for(int i = 0; i < nums.length; i ++){
            if(i < nums.length -1){
                if (nums[i] < target && nums[i + 1] > target) {
                    return i + 1;
                }
            }
            if(nums[i] == target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        searchInsert searchInsert = new searchInsert();
        System.out.println(searchInsert.searchInsert(new int[] {1,3}, 3));
    }
}
