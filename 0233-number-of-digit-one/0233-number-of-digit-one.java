class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long base = 1;
        
        while(base <= n){
            long left = n/base;
            long right = n % base;
            count += (left + 8)/10*base;
            if(left%10 == 1) count+= right + 1;
            base*= 10;
        }
        return count;
    }
    
}