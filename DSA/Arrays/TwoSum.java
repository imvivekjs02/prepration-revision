package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

/*
Problem:
Two Sum

Link:
https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=do1uosyi

Approach:
Use HashMap to store visited numbers.

Time Complexity:
O(n)

Space Complexity:
O(n)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqNum = target - nums[i];
            if (map.containsKey(reqNum)) {
                return new int[] { map.get(reqNum), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}