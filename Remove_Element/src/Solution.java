/**
 * Created by panqiuhui on 2015/1/8.
 */
public class Solution {
    public int removeElement(int[] A, int elem) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[index++] = A[i];
            }
        }
        return index;
    }
}
