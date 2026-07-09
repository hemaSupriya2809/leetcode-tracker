// Last updated: 7/9/2026, 9:17:31 AM
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int prefSum = 0, res = 0, n = satisfaction.length;
        for (int i = n - 1; i >= 0; i--) {
            prefSum += satisfaction[i];
            if (prefSum < 0) {
                break;
            }
            res += prefSum;
        }
        
        return res;
    }
}