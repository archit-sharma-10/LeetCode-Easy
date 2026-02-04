package leetcode;
/*
    3637 - Trionic Array 1
    Topic: Arrays, Brute Force, Two Pointers
    Time: O(n)
    Notes: Used while loops and pointers to traverse through array to find the up-down-up phase.
 */
public class _3637_Trionic_Array_1 {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int p = 0;
        while(p < n - 1 && nums[p] < nums[p + 1]){
            p++;
        }
        if(p == 0) return false;
        int q = p;
        while(q < n - 1 && nums[q] > nums[q + 1]){
            q++;
        }
        if(q == p) return false;
        if(q == n - 1) return false;
        for(int i = q; i < n - 1; i++){
            if(nums[i] >= nums[i+1]) return false;
        }
        return true;
    }
}
