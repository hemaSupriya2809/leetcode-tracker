// Last updated: 7/9/2026, 9:17:13 AM
class Solution {
    public int countCompleteSubstrings(String s, int k) {
        int n = s.length();
        char[] ca = s.toCharArray();
        int cnt = 0;
        for (int len = k; len <= Math.min(n, 26 * k); len += k) {
            int[] f = new int[26];
            int l = 0, r = 0;
            for (; r < n; r++) {
                if (r > 0 && Math.abs(ca[r] - ca[r - 1]) > 2) {
                    l = r;
                    f = new int[26];
                }
                f[ca[r] - 'a']++;
                if (r - l + 1 == len) {
                    if (check(f, k)) cnt++;
                    f[ca[l++] - 'a']--;
                }
            }
        }
        return cnt;
    }

    boolean check(int[] f, int k) {
        for (int i = 0; i < 26; i++) {
            if (f[i] != 0 && f[i] != k) return false;
        }
        return true;
    }
}