package leetcode;
/*
    268 - Missing Number
    Topic: Math / Array
    Time: O(n)
    Notes: Compute expected sum using Gauss formula and subtract actual array sum.
*/
public class _0268_Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length, actual_sum = (n)*(n+1)/2, sum = 0;
        for(int num : nums) sum += num;
        return actual_sum - sum;
    }
}