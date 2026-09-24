// Last updated: 9/24/2026, 12:27:31 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // filling impact of character's
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        // making of result
        List<Integer> res = new ArrayList<>();
        int prev = -1;
        int max = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            if(max == i){
                // partition time
                res.add(max - prev);
                prev = max;
            }
        }
        return res;
    }
}