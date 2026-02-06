package leetcode;
/*
    415 - Add Strings
    Topic: String / Two Pointers
    Time: O(n)
    Notes: Initiate pointers in both strings from the end, keep traversing till i>=0 and j>=0. Take the sum with carry, update carry at every iteration and append modulus with 10 to StringBuilder.
*/
public class _0415_Add_Strings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder("");
        while(i >= 0 || j >= 0 || carry > 0){
            int x = 0, y = 0;
            if(i >= 0){
                x = num1.charAt(i) - '0';
            }
            if(j >= 0){
                y = num2.charAt(j) - '0';
            }
            int value = x+y+carry;
            carry = value/10;
            sb.append(value%10);
            i--; j--;
        }
        return sb.reverse().toString();
    }
}
