/*
Lc-> 349 Intersect of Two Arrays.
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
 */
import java.util.*;

class intersectOfTwoArray{
    public String[]  intersect(String[] word1, String[] word2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<word1.length;i++){
            set1.add(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            if(set1.contains(word2[i])){
                set2.add(word2[i]);
            }
        }
    }
    public static  void main(String[] args){
        intersectOfTwoArray obj = new intersectOfTwoArray();
        System.out.println(obj.intersect(new String[]{1,2,3,4}, new String[]{2,3}));
    }
}