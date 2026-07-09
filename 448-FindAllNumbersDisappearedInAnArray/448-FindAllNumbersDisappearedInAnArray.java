// Last updated: 7/9/2026, 9:18:14 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            while(nums[i] != nums[nums[i] - 1]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}