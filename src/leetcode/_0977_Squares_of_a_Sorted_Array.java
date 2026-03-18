package leetcode;
/*
    977 - Squares of a Sorted Array
    Topic: Two Pointers / Array
    Time: O(n)
    Notes: Using two pointers, we will square values from both sides and then start placing values from the right most end of a new array.
*/
public class _0977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, left = 0, right = n-1, index = n-1;
        int[] result = new int[n];
        while(index > -1){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                result[index--] = nums[left]*nums[left++];
            }else{
                result[index--] = nums[right]*nums[right--];
            }
        }
        return result;
    }
}
