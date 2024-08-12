class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int sum = 0, ind=0;
        int sums[] = new int[n*(n+1)/2];
        for(int i=0;i<n;i++)
        {
            sum = nums[i];
            sums[ind++] = sum;
            for(int j=i+1;j<n;j++)
            {
                sum = sum + nums[j];
                sums[ind++] = sum;
            }
        }
        Arrays.sort(sums);
        int anssum=0;
        for(int i=left-1;i<right;i++)
        {
            anssum = (anssum + sums[i])%(int)(Math.pow(10,9)+7);
        }
        return anssum;
        
    }
}