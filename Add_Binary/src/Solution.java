/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public String addBinary(String a, String b) {
        if (a == null || a.equals("")) {
            return b;
        }
        if (b == null || b.equals("")) {
            return a;
        }
        String result = "";
        if (a.length() > b.length()) {
            String c = b;
            b = a;
            a = c;
        }
        int lendiff = b.length() - a.length();
        int carry = 0;
        int sum;
        int aInt;
        int bInt;
        for (int i = b.length() - 1; i >= 0; i--) {
            aInt = i >= lendiff ? a.charAt(i - lendiff) - 48 : 0;
            bInt = b.charAt(i) - 48;
            sum = aInt + bInt + carry;
            carry = sum / 2;
            result = sum % 2 + result;
        }
        if (carry != 0) {
            result = carry + result;
        }
        return result;
    }
}
