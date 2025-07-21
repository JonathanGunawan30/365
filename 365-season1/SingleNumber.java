import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){return nums[0];}

        for(int i = 0; i < nums.length; i ++){
            int count = 0;
            for(int j = 0; j < nums.length; j ++){
                if (i == j) continue;
                if(nums[j] == nums[i]){count++;}
            }
            if(count == 0){return nums[i];}
        }
        return nums[0];
    }
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.singleNumber(new int[] {1,0,1}));
    }
}
