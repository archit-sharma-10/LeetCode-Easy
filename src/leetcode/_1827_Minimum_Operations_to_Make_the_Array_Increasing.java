package leetcode;
/*
    1827 - Minimum Operations to Make the Array Increasing
    Topic: Greedy / Array
    Time: O(n)
    Notes: Adjust each element to be at least previous + 1 and accumulate required increments.
*/
public class _1827_Minimum_Operations_to_Make_the_Array_Increasing {
    public int minOperations(int[] nums) {
        int diff = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                diff += nums[i-1] - nums[i] + 1;
                nums[i] = Math.max(nums[i-1]+1, nums[i]);
            }
        }
        return diff;
    }
}
