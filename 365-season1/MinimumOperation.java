public class MinimumOperation {
    public static boolean hasDupe(int[] arr, int k){
        for(int i = k; i < arr.length; i ++){
            for(int j = i + 1; j < arr.length; j ++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public int minimumOperations(int[] nums){

        int result = 0;
        for(int i = 0; i < nums.length; i += 3){
            if(hasDupe(nums, i)){
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MinimumOperation min = new MinimumOperation();
        System.out.println(min.minimumOperations(new int[] {1,2,3,4,2,3,3,5,7,1}));
    }
}
