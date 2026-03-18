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
| 217 | Contains Duplicate | HashSet / Array | O(n) | Use hash set to detect duplicates with early exit during single pass. |
| 268 | Missing Number | Math / Array | O(n) | Compute expected sum using Gauss formula and subtract actual array sum. |
| 345 | Reverse Vowels of a String | Two Pointers / String | O(n) | Move two pointers inward to find vowels and swap them in place. |
| 387 | First Unique Character in a String | Array / Frequency Counting | O(n) | Use fixed 26-size frequency array and scan string to find first unique index. |
| 415 | Add Strings | String / Two Pointers | O(n) | Initiate pointers in both strings from the end, keep traversing till i>=0 and j>=0. Take the sum with carry, update carry at every iteration and append modulus with 10 to StringBuilder. |
| 628 | Maximum Product of Three Numbers | Array / Greedy | O(n) | Track three maximums and two minimums in one scan to avoid sorting. |
| 819 | Most Common Word | HashMap / String Processing | O(n) | String processing to traverse through the given text, append all characters. Replace special characters with space as well. Use regex operation "\\s+" in split to create a split array. Create a map to store frequency and check for max freq and if the word's not banned. |
| 832 | Flipping an Image | Array / Two Pointers | O(n^2) | Reverse each row and invert bits using XOR to produce flipped binary image. |
| 836 | Rectangle Overlap | Geometry | O(1) | Check if x,y coordinates of bottom left corner of rectangle 1 are strictly less than upper right corner of rectangle 2. And also check if coordinates of upper right corner of rectangle 1 are strictly greater than bottom left corner of rectangle 2. |
| 977 | Squares of a Sorted Array | Two Pointers / Array | O(n) | Using two pointers, we will square values from both sides and then start placing values from the right most end of a new array. |
| 1266 | Minimum Time Visiting All Points | Math / Geometry | O(n) | Find the maximum absolute distance between x and y coordinates and add to final result. |
| 1365 | How Many Numbers Are Smaller Than the Current Number | Prefix Sum | O(n) | Count frequencies and use prefix sums to compute number of smaller elements. |
| 1636 | Sort Array by Increasing Frequency | HashMap / Sorting | O(n + k log k) | Sort distinct numbers using comparator by frequency ascending and value descending, then rebuild array. |
| 1827 | Minimum Operations to Make the Array Increasing | Greedy / Array | O(n) | Adjust each element to be at least previous + 1 and accumulate required increments. |
| 3637 | Trionic Array 1 | Arrays, Brute Force, Two Pointers | O(n) | Used while loops and pointers to traverse through array to find the up-down-up phase. |
| 3833 | Count Dominant Indices | Array / Prefix Sum | O(n) | Calculated sum of all elements. Now at every element, remove it from sum and check average. Compare with current element and return the count of dominant indicis. |
