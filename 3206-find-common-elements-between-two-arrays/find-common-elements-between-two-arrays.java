class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[] = new int[2];
        HashSet<Integer>h1 = new HashSet<>();
        HashSet<Integer>h2 = new HashSet<>();

        for(int i:nums1)
        {
            h1.add(i);
        }

        for(int i:nums2)
        {
            h2.add(i);
        }
        int count=0;
        for(int i:nums1)
        {
            if(h2.contains(i))
                count++;
        }
        ans[0] = count;
        count=0;

        for(int i:nums2)
        {
            if(h1.contains(i))
            {
                count++;
            }
        }

        ans[1] = count;

        return ans;
    }
}