/*#LC 49- Group Anagrams - Confirmed asked in mongodb coding interview
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
* */
import java.io.*;
import java.util.*;

class solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        //edge case
        if (strs == null || strs.length == 0)
            return output;
        Map<String, List<String>> outputMap = new HashMap<>();
        for (String s : strs) {
            int[] input = new int[26]; //frequency array [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
            for (int i = 0; i < s.length(); i++) {
                input[s.charAt(i) - 'a']++; //ASCII for 'a'=97, 'z'=122 so 122-97=25, 25 would be the index.
            }
            String inputstr = Arrays.toString(input);
            if (outputMap.containsKey(inputstr)) {
                outputMap.get(inputstr).add(s);
            } else {
                List<String> outputList = new ArrayList<>();
                outputList.add(s);
                outputMap.put(inputstr, outputList);
            }
        }
        output.addAll(outputMap.values());
        return output;
    }
    public static void main(String[] args) {
        solution main = new solution();
        System.out.println(main.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}