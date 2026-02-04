package leetcode;
/*
    1 - Two Sum
    Topic: HashMap
    Time: O(n)
    Notes: Single pass using map to store seen values and check complements. Dont confuse with TWO POINTERS.
 */
import java.util.*;
public class _0001_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
