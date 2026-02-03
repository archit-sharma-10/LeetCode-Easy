package leetcode;
import java.util.*;
/*
    1. Two Sum

    Problem asks for the indices of elements that will add up to the target element. At least one solution
    exists for the given target.

    - DEFINITELY NOT A TWO POINTER PROBLEM. USE HASHMAP TO CHECK FOR COMPLIMENT OF CURRENT ELEMENT.
    - In one go, you can check if the compliment of current element exists in map of not, and add the current
    element to the map with its index. If compliment is found, return current index, and get compliment's index
    from the map.
 */
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
