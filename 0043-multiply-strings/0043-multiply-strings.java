class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        int len1 = num1.length();
        int len2 = num2.length();
        
        int[] result = new int[len1 + len2];
        
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                
                int product = digit1 * digit2;
                
                int pos1 = i + j;     
                int pos2 = i + j + 1;  
                
                int sum = product + result[pos2];
                
                result[pos2] = sum % 10;
                
                result[pos1] += sum / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        
        return sb.toString();
    }
}