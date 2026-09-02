// Last updated: 9/2/2026, 10:00:58 AM
class Solution {
    public String findReplaceString(String s, int[] indices,
                                    String[] sources, String[] targets) {
        int n = s.length();
        int[] a = new int[n];
        Arrays.fill(a, -1);

        for (int i = 0; i < indices.length; i++)
            if (s.startsWith(sources[i], indices[i]))
                a[indices[i]] = i;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n;) {
            if (a[i] != -1) {
                int j = a[i];
                ans.append(targets[j]);
                i += sources[j].length();
            } else {
                ans.append(s.charAt(i++));
            }
        }

        return ans.toString();
    }
}