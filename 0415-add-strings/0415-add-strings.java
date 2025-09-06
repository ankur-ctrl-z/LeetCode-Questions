import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger number1 = BigInteger.ZERO;
        BigInteger number2 = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;

        for(int i = 0; i < num1.length(); i++){
            char ch = num1.charAt(i);
            BigInteger digit = BigInteger.valueOf(ch - '0');
            number1 = number1.multiply(ten).add(digit);
        }

        for(int i = 0; i < num2.length(); i++){
            char ch = num2.charAt(i);
            BigInteger digit = BigInteger.valueOf(ch - '0');
            number2 = number2.multiply(ten).add(digit);
        }

        BigInteger result = number1.add(number2);

        return result.toString();
    }
}
