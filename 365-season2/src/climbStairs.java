public class climbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if(n <= 3) return n;

        int current = 0, oneStepBack = 3, twoStepBack = 2;

        for (var i = 3; i < n; i++) {
            current = oneStepBack + twoStepBack;
            twoStepBack = oneStepBack;
            oneStepBack = current;
        }
        
        return current;
    }
}
