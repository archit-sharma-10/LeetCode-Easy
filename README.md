# LeetCode Problems

## ✅ Solved Problems

| # | Title | Topic | Time | Notes |
|---|------|------|------|------|
| 1 | Two Sum | HashMap | O(n) | Single pass using map to store seen values and check complements. Do not confuse with TWO POINTERS. |
| 9 | Palindrome Number | Math | O(n) | Reverse the integer and compare with original to check palindrome. |
| 20 | Valid Parentheses | Stack / String | O(n) | Push expected closing brackets onto stack and match while scanning string. |
| 26 | Remove Duplicates from Sorted Array | Two Pointers / Array | O(n) | Maintain slow pointer for unique elements and fast pointer to scan duplicates. |
| 88 | Merge Sorted Array | Two Pointers / Array | O(m + n) | Fill nums1 from the back using two pointers to avoid overwriting elements. A while loop till the index is greater than 0. Return when pointer of second array reaches the end. |
| 169 | Majority Element | Array / Greedy | O(n) | Use Boyer–Moore voting to cancel out different elements and keep majority candidate. Keep a current element, count of it, if it goes below 0 then change current element and update count to 1. |
| 415 | Add Strings | String / Two Pointers | O(n) | Initiate pointers in both strings from the end, keep traversing till i>=0 and j>=0. Take the sum with carry, update carry at every iteration and append modulus with 10 to StringBuilder. |
| 628 | Maximum Product of Three Numbers | Array / Greedy | O(n) | Track three maximums and two minimums in one scan to avoid sorting. |
| 819 | Most Common Word | HashMap / String Processing | O(n) | String processing to traverse through the given text, append all characters. Replace special characters with space as well. Use regex operation "\\s+" in split to create a split array. Create a map to store frequency and check for max freq and if the word's not banned. |
| 3637 | Trionic Array 1 | Arrays, Brute Force, Two Pointers | O(n) | Used while loops and pointers to traverse through array to find the up-down-up phase. |
| 3833 | Count Dominant Indices | Array / Prefix Sum | O(n) | Calculated sum of all elements. Now at every element, remove it from sum and check average. Compare with current element and return the count of dominant indicis. |
