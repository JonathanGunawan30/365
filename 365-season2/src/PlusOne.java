import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PlusOne {
    public static void main(String[] args) {

        int[] arr = {
                1,2,3
        };
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result));

    }

    public static int[] plusOne(int[] digits) {
//        int temp = 0;
//        for (int digit : digits) {
//            temp = temp * 10 + digit;
//        }
//        temp += 1;
//
//        return String.valueOf(temp).chars().map(c -> c - '0').toArray(); GA MUATTTTTTTTTTT;;;;;;
        StringBuilder sb = new StringBuilder();
        for (int d : digits) sb.append(d);

        BigInteger num = new BigInteger(sb.toString());
        num = num.add(BigInteger.ONE);

        return num.toString().chars().map(c -> c - '0').toArray();

    }
}
