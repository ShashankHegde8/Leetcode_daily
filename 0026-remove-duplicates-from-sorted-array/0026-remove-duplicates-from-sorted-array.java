class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case: Empty array
        
        int i = 0; // Pointer for placing unique elements
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // When a new unique element is found
                i++; // Move the pointer for unique elements
                nums[i] = nums[j]; // Place the unique element in the correct position
            }
        }
        
        // The length of the modified array with unique elements is (i + 1)
        return i + 1;
    }
}
