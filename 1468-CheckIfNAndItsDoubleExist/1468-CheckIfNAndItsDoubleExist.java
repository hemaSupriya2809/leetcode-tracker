// Last updated: 7/9/2026, 9:17:32 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int num : arr) {
            if (map.containsKey(2 * num) || (num % 2 == 0 && map.containsKey(num / 2))) {
                return true; 
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false; 
    }
}