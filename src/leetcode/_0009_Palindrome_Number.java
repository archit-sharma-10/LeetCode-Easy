package leetcode;
/*
    9 - Palindrome Number
    Topic: Math
    Time: O(n)
    Notes: Reverse the integer and compare with original to check palindrome.
*/
public class _0009_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        long num = 0, temp = x;
        while(temp > 0){
            num = num*10 + (temp%10);
            temp/=10;
        }
        return (num == x);
    }
}
