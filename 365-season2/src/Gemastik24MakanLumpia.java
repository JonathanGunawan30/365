import java.util.Scanner;

public class Gemastik24MakanLumpia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int result = 0;

        if(C == 0 && B != 0){
            result += (int) Math.ceil(A / 3.0);
            result += (int) Math.ceil((B + D) / 3.0);
        } else if (B + C == 0){
            result += (int) Math.ceil((A + D) / 3.0);
        } else if(B == 0){
            result += (int) Math.ceil((A + C) / 3.0);
            result += (int) Math.ceil(D / 3.0);
        }
        else {
            result += (int) Math.ceil(A / 3.0);
            if((B / 3.0) == 0){
                result +=  (B / 3);
                result += (int) Math.ceil(C / 3.0);
            } else {
                result += (int) Math.ceil((B + C) / 3.0);
            }

            result += (int) Math.ceil(D / 3.0);
        }

        System.out.println(result);

    }
}
