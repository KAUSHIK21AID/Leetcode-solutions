class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();

        List<Integer>result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hm1.containsKey(nums1[i]))
            {
                hm1.put(nums1[i], hm1.get(nums1[i])+1);
            }
            else
            {
                hm1.put(nums1[i],1);
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(hm1.containsKey(nums2[i]) && hm1.get(nums2[i])>0)
            {
                result.add(nums2[i]);
                hm1.put(nums2[i], 0);
            }
        }
        int arr[] = new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            arr[i] = result.get(i);
        }

        return arr;
    }
}