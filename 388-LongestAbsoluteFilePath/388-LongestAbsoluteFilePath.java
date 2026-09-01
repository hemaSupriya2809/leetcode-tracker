// Last updated: 9/1/2026, 4:06:00 PM
1class Solution {
2    public int lengthLongestPath(String input) {
3        Deque<Integer> stack = new ArrayDeque<>();
4        stack.push(0); // "dummy" length
5        int maxLen = 0;
6        for(String s:input.split("\n")){
7            int lev = s.lastIndexOf("\t")+1; // number of "\t"
8            while(lev+1<stack.size()) stack.pop(); // find parent
9            int len = stack.peek()+s.length()-lev+1; // remove "/t", add"/"
10            stack.push(len);
11            // check if it is file
12            if(s.contains(".")) maxLen = Math.max(maxLen, len-1); 
13        }
14        return maxLen;
15    }
16}