class Solution {
    public boolean isGoodArray(int[] nums) {
        if(findGcd(nums) == 1) return true;
        return false;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // Method to find gcd of an array of numbers
    public static int findGcd(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = gcd(result, nums[i]);
        }
        return result;
    }
}