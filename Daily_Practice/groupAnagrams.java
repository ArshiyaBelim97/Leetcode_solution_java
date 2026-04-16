/*
LC# 49 Group Anagram
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 */

class solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
      // edge case
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int [] count = new int[26]; // frequency array
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'a']++; // substracting ASCII values so that it can fit into the frequency array
            }
            String inputstr = Arrays.toString(count);
            if(map.containsKey(inputstr)){
                map.get(inputstr).add(s)
            }else{
                List<String> outputList = new ArrayList<>();
                outputList.add(s);
                map.put(inputstr,outputList);
            }
        }map.addAll(map.values());
        return output;o

    }
    public static void main(String[] args) {
        solution s = new solution();
        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}