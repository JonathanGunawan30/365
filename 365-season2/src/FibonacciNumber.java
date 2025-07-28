public class FibonacciNumber {
    public static void main(String[] args) {

        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if(n < 4 && n > 1) return n - 1;
        if(n == 0) return 0;
        if(n == 1) return 1;

        int curr = 3, prev= 2, next;

        for (int i = 4; i < n; i++) {
            next = curr + prev;
            prev = curr;
            curr = next;
        }

        return curr;
//        return fib(n - 1) + fib(n - 2);
    }
}
