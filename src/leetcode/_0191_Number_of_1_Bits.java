package leetcode;
/*
    191 - Number of 1 Bits
    Topic: Bit Manipulation
    Time: O(k)
    Notes: Use n & (n-1) to remove the lowest set bit in each iteration until n becomes 0, while incrementing the count.
*/
public class _0191_Number_of_1_Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }
}
