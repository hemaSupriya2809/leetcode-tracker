// Last updated: 7/9/2026, 9:17:29 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
                if(i+j==mat.length-1){
                    sum2=sum2+mat[i][j];
                }
            }
        }
        int s=sum+sum2;
        if(mat.length%2!=0){
            s=s-mat[mat.length/2][mat.length/2];
        }
        return s;
    }
}