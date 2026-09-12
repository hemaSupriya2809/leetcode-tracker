// Last updated: 9/12/2026, 9:34:05 AM
import java.util.Arrays;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {

        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        return nums[nums.length - k];
    }
}