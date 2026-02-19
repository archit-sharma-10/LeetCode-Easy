package leetcode;
/*
    217 - Contains Duplicate
    Topic: HashSet / Array
    Time: O(n)
    Notes: Use hash set to detect duplicates with early exit during single pass.
*/
import java.util.*;
public class _0217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
