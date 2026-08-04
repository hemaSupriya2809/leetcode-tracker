// Last updated: 8/4/2026, 4:25:00 PM
1class Solution {
2    public boolean isCovered(int[][] ranges, int left, int right) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<ranges.length;i++){
5            for(int j=ranges[i][0];j<=ranges[i][1];j++){
6               
7                    set.add(j);
8               
9            }
10        }
11        for(int i=left;i<=right;i++){
12            if(!set.contains(i)){
13               return false;
14            }
15        }
16        
17        return true;
18    }
19}