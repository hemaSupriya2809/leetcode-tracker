// Last updated: 7/9/2026, 9:17:12 AM
class Solution {
  private static final int MAX_NUMBER = 50; 

  public int missingInteger(int[] nums) {

    boolean[] exists = new boolean[MAX_NUMBER + 1];
    for (int num : nums) exists[num] = true;

    int sum = nums[0];
    for (int i = 1; i < nums.length; i++)
      if (nums[i] - nums[i - 1] != 1) break;
      else sum += nums[i];

    int answer = sum;
    while (answer < exists.length && exists[answer]) answer++;
    return answer;
    }
}