class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length; // If array size <= 2, return the size as it is

        int i = 2; // Pointer to place the next valid element

        // Start from the third element (index 2) and check for duplicates
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) { // Allow up to two occurrences
                nums[i] = nums[j]; // Place valid element in correct position
                i++; // Move the pointer
            }
        }

        return i; // 'i' is the length of the modified array with valid elements
    }
}
