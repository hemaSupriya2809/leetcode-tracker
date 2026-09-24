// Last updated: 9/24/2026, 12:28:39 PM
import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        int n=num.length();
        for(int i=1;i<=n/2;i++) {
            for(int j=1;j<=n-i-j;j++) {
                if(num.charAt(0)=='0'&&i>1) continue;
                if(num.charAt(i)=='0'&&j>1) continue;
                BigInteger a=new BigInteger(num.substring(0,i));
                BigInteger b=new BigInteger(num.substring(i,i+j));
                String s=num.substring(i+j);
                while(s.length()>0) {
                    BigInteger c=a.add(b);
                    String sum=c.toString();
                    if(s.startsWith(sum)) {
                        a=b;
                        b=c;
                        s=s.substring(sum.length());
                    } else break;
                }
                if(s.length()==0) return true;
            }
        }
        return false;
    }
}