// Last updated: 8/31/2026, 10:27:17 AM
1class Solution {
2    public int nthSuperUglyNumber(int n, int[] primes) {
3        int k = primes.length;
4
5        int[] dp = new int[n];
6        int[] idx = new int[k];
7
8        // The first super ugly number is 1.
9        dp[0] = 1;
10
11        for (int i = 1; i < n; i++) {
12            long next = Long.MAX_VALUE;
13
14            // Find the smallest candidate.
15            for (int j = 0; j < k; j++) {
16                long candidate = (long) dp[idx[j]] * primes[j];
17                next = Math.min(next, candidate);
18            }
19
20            dp[i] = (int) next;
21
22            // Advance every pointer that produced this value.
23            for (int j = 0; j < k; j++) {
24                long candidate = (long) dp[idx[j]] * primes[j];
25
26                if (candidate == next) {
27                    idx[j]++;
28                }
29            }
30        }
31
32        return dp[n - 1];
33    }
34}