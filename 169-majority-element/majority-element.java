class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
        Arrays.sort(nums);
        int ans=nums[n];
        return ans;
    }
}