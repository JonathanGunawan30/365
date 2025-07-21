public class IntToRoman {
    public String intToRoman(int num) {
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();

        int index = 0;
        for(int i = num; i > 0;){
            while(i >= value[index]){
                result.append(symbol[index]);
                i -= value[index];
            }
            index++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        IntToRoman obj = new IntToRoman();
        System.out.println(obj.intToRoman(1994));
    }
}
