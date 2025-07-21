class Solution {
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        String reverse = "";
        for(int i = a.length() -1; i >= 0; i --){
            reverse += a.charAt(i);
        }
        return(a.equals(reverse));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }
}



