class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum = 0;
        List<Integer>sums = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            sum = nums[i];
            sums.add(sum);
            for(int j=i+1;j<n;j++)
            {
                sum = sum + nums[j];
                sums.add(sum);
            }
        }
        Collections.sort(sums);
        int anssum=0;
        for(int i=left-1;i<right;i++)
        {
            anssum = (anssum + sums.get(i))%(int)(Math.pow(10,9)+7);
        }
        return anssum;
        
    }
}