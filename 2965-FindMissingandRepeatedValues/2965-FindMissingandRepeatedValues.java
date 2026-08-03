// Last updated: 8/3/2026, 2:50:38 PM
1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        HashSet<Integer> set=new HashSet<>();
4       int ans[]=new int[2];
5       int ind=0;
6        for(int i=0;i<grid.length;i++){
7            for(int j=0;j<grid[i].length;j++){
8                if(set.contains(grid[i][j])){
9                    ans[ind]=grid[i][j];
10                    ind++;
11                }
12                else{
13                    set.add(grid[i][j]);
14                }
15            }
16        }
17        
18        for (int i = 1; i <= grid.length * grid.length; i++) {
19            if (!set.contains(i)) {
20                ans[ind] = i;
21                break;
22            }
23        }
24        return ans;
25    }
26}