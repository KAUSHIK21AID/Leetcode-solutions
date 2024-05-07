class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int n) {
        List<Boolean>l = new ArrayList<>();
        int max = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]+n>=max);
        }

        return l;
    }
}