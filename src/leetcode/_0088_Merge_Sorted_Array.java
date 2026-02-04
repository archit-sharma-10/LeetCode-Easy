package leetcode;
/*
    88 - Merge Sorted Array
    Topic: Two Pointers / Array
    Time: O(m + n)
    Notes: Fill nums1 from the back using two pointers to avoid overwriting elements. A while loop till the index is greater than 0. Return when pointer of second array reaches the end.
 */
public class _0088_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        int i = m - 1, j = n - 1;
        if(n == 0) return;
        while(index >= 0){
            if(j == -1) return;
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[index--] = nums1[i--];
            }else{
                nums1[index--] = nums2[j--];
            }
        }
    }
}
