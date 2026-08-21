// Last updated: 8/21/2026, 9:39:38 AM
1class Solution {
2    public int nextGreaterElement(int n) {
3        char[] a = String.valueOf(n).toCharArray();
4        int i = a.length - 2;
5        while (i >= 0 && a[i] >= a[i + 1]) {
6            i--;
7        }
8        if (i < 0) {
9            return -1;
10        }
11        int j = a.length - 1;
12        while (a[j] <= a[i]) {
13            j--;
14        }
15        char temp = a[i];
16        a[i] = a[j];
17        a[j] = temp;
18        int left = i + 1;
19        int right = a.length - 1;
20        while (left < right) {
21            temp = a[left];
22            a[left] = a[right];
23            a[right] = temp;
24            left++;
25            right--;
26        }
27        long ans = Long.parseLong(new String(a));
28        if (ans > Integer.MAX_VALUE) {
29            return -1;
30        }
31        return (int) ans;
32    }
33}