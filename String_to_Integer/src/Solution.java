/**
 * Created by panqiuhui on 2014/12/1.
 */
public class Solution {
    public int atoi(String str) {
        if (str == null) {
            return 0;
        }

        str = str.trim();

        int result = 0;
        int radix = 10;
        boolean negative = false;
        int i = 0, len = str.length();
        int limit = -Integer.MAX_VALUE;
        int multmin;
        int digit;

        if (len > 0) {
            char firstChar = str.charAt(0);
            if (firstChar < '0') { // Possible leading "+" or "-"
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+') {
                    return 0;
                }
                if (len == 1) { // Cannot have lone "+" or "-"
                    return 0;
                }
                i++;
            }
            multmin = limit / radix;
            while (i < len) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                digit = Character.digit(str.charAt(i++), radix);
                if (digit < 0) {
                    break;
                }
                if (result < multmin) {
                    result = limit;
                    break;
                }
                result *= radix;
                if (result < limit + digit) {
                    result = limit;
                    break;
                }
                result -= digit;
            }
        }
        return negative ? result : -result;
    }
}
