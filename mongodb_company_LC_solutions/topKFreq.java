/* Lc#347
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
import java.util.*;

class Solution{
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer> bucket = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if (bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }bucket[freq].add(key);
        }int [] result = new int [k];
        int counter = 0;
        for(int pos=bucket.length - 1; pos>=0 && counter<k;pos--){
            if(bucket[pos] != null){
                for(Integer integer: bucket[pos]){
                    result[counter++] = integer;
                }
            }
        }return res;
    }
}