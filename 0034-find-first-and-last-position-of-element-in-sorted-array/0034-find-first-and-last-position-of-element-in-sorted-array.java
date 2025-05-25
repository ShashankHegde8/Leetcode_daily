class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find first occurrence
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) result[0] = mid;
        }

        // Find last occurrence
        left = 0; right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) result[1] = mid;
        }
        return result;
    }
}
