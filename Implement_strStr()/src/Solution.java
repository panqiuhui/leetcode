/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack == null ||needle == null) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String s = haystack.substring(i, i + needle.length());
            if (s.equals(needle)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
