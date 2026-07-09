// Last updated: 7/9/2026, 9:17:26 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}