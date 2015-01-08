/**
 * Created by panqiuhui on 2015/1/8.
 */
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[index - 1]) {
                A[index++] = A[i];
            }
        }
        return index;
    }
}
