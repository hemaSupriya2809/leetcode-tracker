// Last updated: 8/12/2026, 2:45:44 PM
1class Solution {
2    public int countCharacters(String[] words, String chars) {
3        int sum = 0; 
4        HashMap<Character, Integer> map = new HashMap<>();
5        for(char ch : chars.toCharArray()){
6            map.put(ch, map.getOrDefault(ch, 0) + 1);
7        }
8        for(int i = 0; i < words.length; i++){
9            String word = words[i];
10            HashMap<Character, Integer> temp = new HashMap<>(map);
11            boolean isGood = true;
12            for(char ch : word.toCharArray()){
13                if(temp.getOrDefault(ch,0) == 0){
14                    isGood = false;
15                    break;
16                }
17                else{
18                    temp.put(ch, temp.getOrDefault(ch, 0) - 1);
19                };
20            }
21            if(isGood){
22                sum += word.length();
23            }
24        }
25        return sum;
26    }
27}