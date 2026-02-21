package leetcode;
/*
    1365 - How Many Numbers Are Smaller Than the Current Number
    Topic: Prefix Sum
    Time: O(n)
    Notes: Count frequencies and use prefix sums to compute number of smaller elements.
*/
public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] prefix = new int[101];
        for(int num : nums){
            prefix[num]++;
        }
        for(int i=1;i<=100;i++){
            prefix[i] = prefix[i-1] + prefix[i];
        }
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) result[i] = 0;
            else result[i] = prefix[nums[i] - 1];
        }
        return result;
    }
}
