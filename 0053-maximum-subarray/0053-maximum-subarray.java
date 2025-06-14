class Solution {
    public int maxSubArray(int[] nums) {
        int maxend=nums[0];
        int maxhigh=nums[0];
        for (int i=1;i<nums.length;i++){
            maxend=Math.max(nums[i],maxend+nums[i]);
            maxhigh=Math.max(maxend,maxhigh);
        }
        return maxhigh;
    }
}