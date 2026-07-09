// Last updated: 7/9/2026, 9:19:55 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) >>> 1);

            if(target == nums[mid]){
                return mid;
            }
            if (target > nums[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
