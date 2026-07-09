// Last updated: 7/9/2026, 9:19:36 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows=matrix.length;
       int cols=matrix[0].length;
       for(int i=0,j=cols-1;i<rows&&j>=0;){
        if(matrix[i][j]==target){
            return true;
        }
        else if(matrix[i][j]>target){
            j--;
        }
        else{
            i++;
        }
       } 
       return false;
    }
}