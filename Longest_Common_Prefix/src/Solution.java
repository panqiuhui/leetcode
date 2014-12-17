/**
 * Created by panqiuhui on 2014/12/1.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int minIndex = 0;
        if (strs.length == 0) {
            return result;
        }
        for (int i = 0; i < strs.length; i++) {
            if (strs[minIndex].length() > strs[i].length()) {
                minIndex = i;
            }
        }
        for (int i = 0; i < strs[minIndex].length(); i++) {
            boolean isContain = true;
            for (int j = 0; j < strs.length; j++) {
                if (j != minIndex) {
                    if (strs[j].charAt(i) != strs[minIndex].charAt(i)) {
                        isContain = false;
                        break;
                    }
                }
            }
            if (isContain) {
                result += strs[minIndex].charAt(i);
            } else {
                break;
            }
        }
        return result;
    }
}
