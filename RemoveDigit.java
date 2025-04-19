public class RemoveDigit {
    public String removeDigit(String number, char digit) {
        String result = "";
    
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                StringBuilder sb = new StringBuilder();
    
                for (int j = 0; j < number.length(); j++) {
                    if (j != i) {
                        sb.append(number.charAt(j));
                    }
                }
    
                String current = sb.toString();
                if (result.equals("") || current.compareTo(result) > 0) {
                    result = current;
                }
            }
        }
    
        return result;
    }
    

    public static void main(String[] args) {
        RemoveDigit obj = new RemoveDigit();
        System.out.println(obj.removeDigit("1231", '1'));
    }
}
