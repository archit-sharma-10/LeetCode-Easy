package leetcode;
/*
    819 - Most Common Word
    Topic: HashMap / String Processing
    Time: O(n)
    Notes: String processing to traverse through the given text, append all characters. Replace special characters with space as well. Use regex operation "\\s+" in split to create a split array. Create a map to store frequency and check for max freq and if the word's not banned.
*/
import java.util.*;
public class _0819_Most_Common_Word {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> ban = Arrays.asList(banned);
        paragraph = paragraph.toLowerCase();
        StringBuilder sb = new StringBuilder("");
        for(char c : paragraph.toCharArray()){
            if(!Character.isLetter(c) && c != ' '){
                sb.append(" ");
            }else{
                sb.append(c);
            }
        }
        List<String> arr = Arrays.asList(sb.toString().split("\\s+"));
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0) + 1);
        }
        int max = 0;
        String answer = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String word = entry.getKey();
            int freq = entry.getValue();
            if(max < freq && !ban.contains(word)){
                max = freq; answer = word;
            }
        }
        return answer;
    }
}
