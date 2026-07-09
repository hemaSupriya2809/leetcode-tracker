// Last updated: 7/9/2026, 9:18:37 AM
class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);
      
       int h=0;
       for(int i=citations.length-1;i>=0;i--){
        if(citations[i]>h){
         
            h++;
        }
        else{
            break;
        }
       }
       return h;
    }
}