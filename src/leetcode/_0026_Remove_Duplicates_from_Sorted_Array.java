package leetcode;
/*
    26 - Remove Duplicates from Sorted Array
    Topic: Two Pointers / Array
    Time: O(n)
    Notes: Maintain slow pointer for unique elements and fast pointer to scan duplicates.
*/
public class _0026_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while(j < nums.length){
            if(nums[i] == nums[j]){
                j++;
            }else{
                nums[++i] = nums[j++];
            }
        }
        return i+1;
    }
}
