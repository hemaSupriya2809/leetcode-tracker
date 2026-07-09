// Last updated: 7/9/2026, 9:18:41 AM
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  
                num = num / 10;    
            }
            
            num = sum; 
        }
        
        return num;  
    }
}

