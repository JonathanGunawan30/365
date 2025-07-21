
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
                
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        System.out.println(obj.removeElement(new int[]{3,2,2,3}, 3));
    }
}
