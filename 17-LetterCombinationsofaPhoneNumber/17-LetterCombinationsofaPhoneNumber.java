// Last updated: 9/15/2026, 9:38:09 AM
1class Solution {
2    String mapping[] = {
3        "",
4        "",
5        "abc",
6        "def",
7        "ghi",
8        "jkl",
9        "mno",
10        "pqrs",
11        "tuv",
12        "wxyz"
13    };
14
15    List<String> result = new ArrayList<>();
16
17    public List<String> letterCombinations(String digits) {
18        if (digits.length() == 0) {
19            return result;
20        }
21
22        backtrack(0, digits, "");
23        return result;
24    }
25
26    public void backtrack(int index, String digits, String current) {
27        if (index == digits.length()) {
28            result.add(current);
29            return;
30        }
31
32        int digit = digits.charAt(index) - '0';
33        String letters = mapping[digit];
34
35        for (char ch : letters.toCharArray()) {
36            backtrack(index + 1, digits, current + ch);
37        }
38    }
39}