/**
 * Created by panqiuhui on 2014/12/1.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        boolean result = true;
        String str = String.valueOf(x);
        int len = str.length();
        int mid = len / 2 - 1;
        for (int i = 0; i <= mid; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
