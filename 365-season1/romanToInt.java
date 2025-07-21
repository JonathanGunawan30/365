class Solution {
    public int romanToInt(String s) {
        String[] symbol = {"IV", "IX", "XL", "XC", "CD", "CM", "I", "V", "X", "L", "C", "D", "M"};
        int[] value = {4, 9, 40, 90, 400, 900, 1, 5, 10, 50, 100, 500, 1000};

        int curr = 0;
        for (int i = 0; i < s.length(); ) {
            boolean matched = false;

            if (i + 1 < s.length()) {
                String twoChar = s.substring(i, i + 2);
                for (int j = 0; j < symbol.length; j++) {
                    if (symbol[j].equals(twoChar)) {
                        curr += value[j];
                        i += 2;
                        matched = true;
                        break;
                    }
                }
            }

            if (!matched) {
                String oneChar = s.substring(i, i + 1);
                for (int j = 0; j < symbol.length; j++) {
                    if (symbol[j].equals(oneChar)) {
                        curr += value[j];
                        i += 1;
                        break;
                    }
                }
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
