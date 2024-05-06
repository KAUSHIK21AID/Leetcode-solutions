class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int m = Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            m = Math.max(m, nums[i]-nums[i-1]);
        }

        return (m!=Integer.MIN_VALUE)?m:0;
    }
}