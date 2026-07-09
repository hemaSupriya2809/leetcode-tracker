// Last updated: 7/9/2026, 9:20:14 AM
class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1){
        return s;
       } 
       StringBuilder rows[]=new StringBuilder[numRows];
       for(int i=0;i<numRows;i++){
        rows[i]=new StringBuilder();
       }
       int row=0;
       boolean d=true;
       for(int i=0;i<s.length();i++){
         rows[row].append(s.charAt(i));
         if(row==numRows-1){
            d=false;
         }
         else if(row==0){
            d=true;
         }
         if(d){
            row++;
         }
         else{
            row--;
         }
       }
       String a="";
       for(int i=0;i<numRows;i++){
        a+=rows[i].toString();
       }
       return a;

    }
}