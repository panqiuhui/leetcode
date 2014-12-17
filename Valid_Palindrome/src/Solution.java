/**
 * Created by panqiuhui on 2014/12/1.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        if (s == null) {
            return result;
        }
        String trim = s.trim();
        if (trim.equals("")) {
            return result;
        }
        int l = 0;
        int u = trim.length() - 1;
        while (l < trim.length() && !isAlphanumeric(trim.charAt(l))) {
            l++;
        }
        while (u >= 0 && !isAlphanumeric(trim.charAt(u))) {
            u--;
        }
        while (l < u) {
            if (!String.valueOf(trim.charAt(l)).equalsIgnoreCase(String.valueOf(trim.charAt(u)))) {
                result = false;
            }
            do {
                l++;
            } while (l <= trim.length() && !isAlphanumeric(trim.charAt(l)));
            do {
                u--;
            } while (u >= 0 && !isAlphanumeric(trim.charAt(u)));
        }
        return result;
    }

    private boolean isAlphanumeric(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else if (c >= 'a' && c <= 'z') {
            return true;
        } else if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPalindrome("."));
    }
}
