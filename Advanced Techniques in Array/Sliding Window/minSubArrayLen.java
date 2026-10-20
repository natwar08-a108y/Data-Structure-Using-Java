// Solution of leetcode 209
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            // 1. Expand the window by adding the element at the right pointer
            currentSum += nums[right];

            // 2. Shrink the window from the left while the condition is satisfied
            while (currentSum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                currentSum -= nums[left]; // Remove element leaving the window
                left++;                   // Move left pointer forward
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}