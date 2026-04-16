/* Lc#242
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */

import java.util.*;

class Solution {
    public boolean validAnagram(String[] s1, String[] s2) {
       //edge case
        if(s1.length() != s2.length()){
           return false;
       }
        str1 = s1.toLowerCase();
        str2 = s2.toLowerCase();

        a= str1.replace(" ", "");
        b =str2.replace(" ", "");
        int[] char_arr = new int[26]; // frequency array
        for(int i=0; i<a.length();i++){
            char_arr[a.charAt(i) - 'a']++;
        }
        for(int i=0; i< b.length(); i++){
            char_arr[b.charAt(i) - 'a']--;
        }
        for(int count : char_arr){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}