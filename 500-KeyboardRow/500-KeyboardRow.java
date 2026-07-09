// Last updated: 7/9/2026, 9:18:09 AM
class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            if (keyBoardVerify(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    static boolean keyBoardVerify(String st) {
        String[] stArr = {
            "qwertyuiopQWERTYUIOP",
            "asdfghjklASDFGHJKL",
            "zxcvbnmZXCVBNM"
        };
        char ch = st.charAt(0);
        int ind = -1;
        // Find the row of the first letter
        for (int i = 0; i < stArr.length; i++) {
            if (stArr[i].indexOf(ch) >= 0) {
                ind = i;
                break;
            }
        }
        // Check if all characters are in that row
        for (int i = 1; i < st.length(); i++) {
            ch = st.charAt(i);
            if (stArr[ind].indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}