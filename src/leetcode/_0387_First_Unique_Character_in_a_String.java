package leetcode;
/*
    387 - First Unique Character in a String
    Topic: Array / Frequency Counting
    Time: O(n)
    Notes: Use fixed 26-size frequency array and scan string to find first unique index.
*/
public class _0387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        for(int i=0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            if (freq[index] == 1) return i;
        }
        return -1;
    }
}
