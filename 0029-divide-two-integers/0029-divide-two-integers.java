class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (divisor == 1) return dividend;
        if (divisor == -1) return -dividend;
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long  dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            if ((dvs << i) <= dvd) {
            ans |= (1 << i);
            dvd -= (dvs << i);
            }
        }
        if(negative) ans = -ans;
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return Integer.MAX_VALUE;
        
        return ans;
    

    }
}