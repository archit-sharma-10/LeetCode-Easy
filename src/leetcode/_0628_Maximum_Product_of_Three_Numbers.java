package leetcode;
/*
    628 - Maximum Product of Three Numbers
    Topic: Array / Greedy
    Time: O(n)
    Notes: Track three maximums and two minimums in one scan to avoid sorting.
*/

public class _0628_Maximum_Product_of_Three_Numbers {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num > max2){
                max3 = max2;
                max2 = num;
            }else{
                max3 = Math.max(num,max3);
            }

            if(num < min1){
                min2 = min1;
                min1 = num;
            }else{
                min2 = Math.min(num,min2);
            }
        }
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
