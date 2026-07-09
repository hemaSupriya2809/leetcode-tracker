// Last updated: 7/9/2026, 9:18:13 AM
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g); 
        Arrays.sort(s); 
        int child = 0; 
        int cookie = 0; 
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) { 
                child++; 
            }
            cookie++; 
        }
        return child;
    }
}