class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1)
        {
            return 0;
        }
        Arrays.sort(nums);
        int left=0, right=k-1;
        int mi=Integer.MAX_VALUE;
        while(right<=nums.length-1)
        {
            mi = Math.min(mi,nums[right++]-nums[left++]);
        }
        return mi;
    }
}