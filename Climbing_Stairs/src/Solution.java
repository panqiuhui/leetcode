/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int n_2 = 1;
        int n_1 = 1;
        int current;
        for (int i = 2; i <= n; i++) {
            //到达当前高度的方法数等于到达高度为n-1的方法数加上到达高度为n-2的方法数
            current = n_2 + n_1;
            n_2 = n_1;
            n_1 = current;
        }
        return n_1;
    }
}
