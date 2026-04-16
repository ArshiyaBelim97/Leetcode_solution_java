/* Lc#1
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

import java.util.*;
/* ---------Brute force solution------------*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
    }return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] res = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(res));
    }
}

/* -----------------optimal solution with Hashmap -------------------*/
class Solution{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(map.containsKey(target-num)){
                return new int[] {map.get(target-num),i};
            }map.put(num,i);
        }return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] res = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(res));
    }
}