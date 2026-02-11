package leetcode;
/*
    169 - Majority Element
    Topic: Array / Greedy
    Time: O(n)
    Notes: Use Boyer–Moore voting to cancel out different elements and keep majority candidate. Keep a current element, count of it, if it goes below 0 then change current element and update count to 1.
*/
public class _0169_Majority_Element {
    public int majorityElement(int[] nums) {
        int count = 0, curr = nums[0];
        for(int num : nums){
            if(curr == num){
                count++;
            }else{
                count--;
                if(count<0){
                    curr = num;
                    count = 1;
                }
            }
        }
        return curr;
    }
}
