class Solution {
    public double minimumAverage(int[] nums) {
        double mi = Double.MAX_VALUE;

        Arrays.sort(nums);

        int left=0, right=nums.length-1;

        while(left<right)
        {
            mi = Math.min(mi,(nums[left++]+nums[right--])/2.0);
        }

        return mi;
    }
}