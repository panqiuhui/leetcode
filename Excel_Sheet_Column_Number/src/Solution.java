/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result += alphabet.indexOf(c) * Math.pow(26, (s.length() - i - 1));
        }
        return result;
    }
}
