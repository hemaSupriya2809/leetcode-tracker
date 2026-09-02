// Last updated: 9/2/2026, 9:59:29 AM
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set=new HashSet<>();
       int ans[]=new int[2];
       int ind=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])){
                    ans[ind]=grid[i][j];
                    ind++;
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        
        for (int i = 1; i <= grid.length * grid.length; i++) {
            if (!set.contains(i)) {
                ans[ind] = i;
                break;
            }
        }
        return ans;
    }
}