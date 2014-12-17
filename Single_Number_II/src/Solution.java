/**
 * Created by panqiuhui on 2014/12/2.
 */
public class Solution {
    public int singleNumber(int[] A) {
        int ones = 0;
        int twos = 0;
        int xthrees = 0;
        for (int i = 0; i < A.length; i++) {
            twos |= (ones & A[i]);
            ones ^= A[i];
            xthrees = ~(ones & twos);
            ones &= xthrees;
            twos &= xthrees;
        }
        return ones;
    }
}
