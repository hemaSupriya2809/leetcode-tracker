// Last updated: 9/2/2026, 10:01:26 AM
class Solution {
    public int nextGreaterElement(int n) {
        char[] a = String.valueOf(n).toCharArray();
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = a.length - 1;
        while (a[j] <= a[i]) {
            j--;
        }
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        int left = i + 1;
        int right = a.length - 1;
        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        long ans = Long.parseLong(new String(a));
        if (ans > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) ans;
    }
}