public class BestTime {
    public static void main(String[] args) {
        int[] arr = {
                7,1,5,3,6,4
        };
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices){

        int currMax = 0, low = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] < low){
                low = prices[i];
            } else if(prices[i] - low > currMax) {
                currMax = prices[i] - low;
            }
        }

        return currMax;
    }
}
