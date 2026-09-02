// Last updated: 9/2/2026, 9:59:53 AM
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