/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public int trailingZeroes(int n) {
        //分解因子, 当且仅当因子中出现一对(2,5)时, 最后结果会增加一个trailing zero.
        //1. 2的个数永远多于5的个数，只需计算5的个数即可
        //2. 计算5的个数时, 最简单的方法是SUM(N/5^1,  N/5^2, N/5^3...)
        int result = 0;
        while (n != 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }
}
