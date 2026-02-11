package leetcode;
/*
    20 - Valid Parentheses
    Topic: Stack / String
    Time: O(n)
    Notes: Push expected closing brackets onto stack and match while scanning string.
*/
import java.util.Stack;
public class _0020_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(')');
            }else if(c == '{'){
                st.push('}');
            }else if(c == '['){
                st.push(']');
            }else{
                if(st.empty()) return false;
                if(!(c == st.pop())) return false;
            }
        }
        return st.empty();
    }
}
