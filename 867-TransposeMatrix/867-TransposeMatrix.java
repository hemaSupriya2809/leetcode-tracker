// Last updated: 9/12/2026, 9:35:08 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int a[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[j][i]=matrix[i][j];
            }
        }
        return a;
    }
}