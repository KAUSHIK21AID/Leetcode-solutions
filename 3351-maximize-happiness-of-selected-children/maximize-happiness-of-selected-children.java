class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer>p = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:happiness)
        {
            p.add(i);
        }

        long ans = 0;
        int j = 0;
        while(k!=0)
        {
            int v = p.poll() - j;
            if(v>0)
                ans = ans + (long)v;
            j++;
            k--;
        }

        return ans;
    }
}