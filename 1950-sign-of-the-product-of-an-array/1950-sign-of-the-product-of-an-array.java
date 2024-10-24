class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;  // Start with a positive sign
        
        for (int num : nums) {
            if (num == 0) {
                return 0;  // If any number is 0, the product is 0
            }
            if (num < 0) {
                sign = -sign;  // Flip the sign when encountering a negative number
            }
        }
        
        return sign;
    }
}