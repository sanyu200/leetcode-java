// Problem: Valid Angram (LeetCode)
// Pattern: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)  

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

         if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);        
    }
}
