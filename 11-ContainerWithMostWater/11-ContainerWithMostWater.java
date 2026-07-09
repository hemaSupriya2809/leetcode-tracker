// Last updated: 7/9/2026, 9:20:10 AM
class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l < r)
         {
            int wid = r - l;
            int minh = Math.min(height[l], height[r]);
            int ca = minh * wid;

            if (ca > max)
             {
                max = ca;
            }
            if (height[l] < height[r])
            {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}