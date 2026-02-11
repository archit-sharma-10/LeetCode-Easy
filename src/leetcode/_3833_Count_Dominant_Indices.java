package leetcode;
/*
    3833 - Dominant Indices
    Topic: Array / Prefix Sum
    Time: O(n)
    Notes: Calculated sum of all elements. Now at every element, remove it from sum and check average. Compare with current element and return the count of dominant indicis.
*/
public class _3833_Count_Dominant_Indices {
    public int dominantIndices(int[] nums) {
        long sum = 0;
        for(int num : nums) sum+=num;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            sum -= nums[i];
            double average = (double) sum/(nums.length-i-1);
            if(nums[i] > average) count++;
        }
        return count;
    }
}
