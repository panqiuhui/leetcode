/**
 * Created by panqiuhui on 2015/1/5.
 */
public class Solution {
    public String convertToTitle(int n) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        while (n != 0) {
            n--;
            result = alphabet.charAt(n % 26) + result;
            n /= 26;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convertToTitle(701));
    }
}
