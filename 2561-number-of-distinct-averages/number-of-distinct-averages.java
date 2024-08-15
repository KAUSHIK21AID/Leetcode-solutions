class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double>hs = new HashSet<>();
        int left=0,right=nums.length-1;
        Arrays.sort(nums);

        while(left<right)
        {
            hs.add((nums[left++]+nums[right--])/2.0);
        }

        return hs.size();
    }
}