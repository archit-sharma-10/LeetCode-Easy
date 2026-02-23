package leetcode;
/*
    1636 - Sort Array by Increasing Frequency
    Topic: HashMap / Sorting
    Time: O(n + k log k)
    Notes: Sort distinct numbers using comparator by frequency ascending and value descending, then rebuild array.
*/
import java.util.*;
public class _1636_Sort_Array_by_Increasing_Frequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer> unique = new ArrayList<>(map.keySet());
        Collections.sort(unique, (a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return b.compareTo(a);
            }
            return map.get(a).compareTo(map.get(b));
        });
        int[] result = new int[nums.length];
        int index = 0;
        for(int num : unique){
            int count = map.get(num);
            while(count > 0){
                result[index++] = num;
                count--;
            }
        }
        return result;
    }
}
