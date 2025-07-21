import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;

        if((digits[last]) == 9 && (digits[0])  == 9 && digits.length > 1){
            int [] arrr = new int[digits.length + 1];
            arrr[0] = 1; arrr[1] = 0; arrr[2] = 0;
            return arrr;
        }

        if((digits[last] + 1) >= 10){
            int [] arr = new int[digits.length + 1];

            for(int i =0; i < digits.length; i ++){
                arr[i] = digits[i];
            }

            int temp = digits[last] += 1;
            String tempStr = Integer.toString(temp);
            int one = Integer.parseInt(Character.toString(tempStr.charAt(0)));
            int two = Integer.parseInt(Character.toString(tempStr.charAt(1)));

            arr[last] = one;
            arr[last + 1] = two;

            return arr;
        } else {
            digits[last] += 1;
        }
        
        return digits;
    }

    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[]arr = {9,9};
        System.out.println(Arrays.toString(obj.plusOne(arr)));
    }
}
