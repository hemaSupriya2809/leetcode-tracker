// Last updated: 9/7/2026, 10:12:18 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        for (int i = 0; i < board.length; i++) {
4            for (int j = 0; j < board[0].length; j++) {
5                if (dfs(board, word, i, j, 0))
6                    return true;
7            }
8        }
9        return false;
10    }
11
12    boolean dfs(char[][] b, String w, int i, int j, int k) {
13        if (k == w.length()) return true;
14
15        if (i < 0 || j < 0 || i >= b.length || j >= b[0].length ||
16            b[i][j] != w.charAt(k))
17            return false;
18
19        char temp = b[i][j];
20        b[i][j] = '#';
21
22        boolean found = dfs(b, w, i + 1, j, k + 1) ||
23                        dfs(b, w, i - 1, j, k + 1) ||
24                        dfs(b, w, i, j + 1, k + 1) ||
25                        dfs(b, w, i, j - 1, k + 1);
26
27        b[i][j] = temp;
28
29        return found;
30    }
31}
32
33