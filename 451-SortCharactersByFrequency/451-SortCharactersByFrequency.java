// Last updated: 8/20/2026, 2:28:14 PM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        for (char ch : s.toCharArray()) {
5            map.put(ch, map.getOrDefault(ch, 0) + 1);
6        }
7        ArrayList<Character> list = new ArrayList<>(map.keySet());
8        list.sort((a, b) -> map.get(b) - map.get(a));
9        StringBuilder ans = new StringBuilder();
10        for (char ch : list) {
11            int freq = map.get(ch);
12            for (int i = 0; i < freq; i++) {
13                ans.append(ch);
14            }
15        }
16        return ans.toString();
17    }
18}