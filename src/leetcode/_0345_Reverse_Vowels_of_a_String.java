package leetcode;
/*
    345 - Reverse Vowels of a String
    Topic: Two Pointers / String
    Time: O(n)
    Notes: Move two pointers inward to find vowels and swap them in place.
*/
public class _0345_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while(left < right){
            if (!isVowel(arr[left])) {
                left++;
            } else if (!isVowel(arr[right])) {
                right--;
            } else {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    void swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
