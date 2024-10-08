class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        for(int i:nums)
        {
            if(!hs.contains(i))
                hs.add(i);
        }
        int ans[] = new int[hs.size()];
        int j=0;
        for(int i:hs)
        {
            ans[j++] = i;
        }
        Arrays.sort(ans);
        if(j<3)
        {
            return ans[ans.length-1];
        }
        return ans[ans.length-3];
    }
}