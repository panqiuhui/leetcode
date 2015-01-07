/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.trim().equals("")) {
            return 0;
        }
        int result = 0;
        String[] strs = s.split(" ");
        if (strs.length > 0) {
            result = strs[strs.length - 1].length();
        } else {
            result = s.trim().length();
        }
        return result;
    }
}
