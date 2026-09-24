// Last updated: 9/24/2026, 12:29:59 PM
class Solution {
    String mapping[] = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return result;
        }

        backtrack(0, digits, "");
        return result;
    }

    public void backtrack(int index, String digits, String current) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            backtrack(index + 1, digits, current + ch);
        }
    }
}