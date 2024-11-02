class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0; // No jumps needed if we're already at the last index
        }

        int jumps = 0;       // Number of jumps needed
        int currentEnd = 0;  // End of the current range we can jump within
        int farthest = 0;    // Farthest we can reach with the next jump

        for (int i = 0; i < nums.length - 1; i++) {
            // Update the farthest we can reach
            farthest = Math.max(farthest, i + nums[i]);

            // If we've reached the end of the current range
            if (i == currentEnd) {
                jumps++;            // We need to make a jump
                currentEnd = farthest; // Update the range to the farthest we can reach

                // If the current range reaches or exceeds the last index, we’re done
                if (currentEnd >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
