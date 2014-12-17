/**
 * Created by panqiuhui on 2014/12/2.
 */
public class Solution {
    public int singleNumber(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++) {
            result ^= A[i];//异或操作，同一个数之间的异或等于0
        }
        return result;
    }
}
