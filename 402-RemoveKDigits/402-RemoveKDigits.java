// Last updated: 8/14/2026, 11:54:50 AM
1class Solution {
2    public String removeKdigits(String num, int k) {
3
4        Stack<Character> st = new Stack<>();
5
6        if (k >= num.length()) return "0";
7
8        for (int i = 0; i < num.length(); i++) {
9
10            char digit = num.charAt(i);
11
12            while (!st.isEmpty() && k > 0 && st.peek() > digit) {
13                st.pop();
14                k--;
15            }
16
17            st.push(digit);
18        }
19
20        while (k > 0 && !st.isEmpty()) {
21            st.pop();
22            k--;
23        }
24
25
26        
27        StringBuilder ans = new StringBuilder();
28
29        for (char c : st) {
30            ans.append(c);
31        }
32
33        int j = 0;
34
35        for (j = 0; j < ans.length() - 1; j++) {
36            if (ans.charAt(j) != '0') {
37                break;
38            }
39        }
40
41        String result = ans.substring(j);
42
43        if(result.length() == 0) return "0";
44
45        return result;
46    }
47}