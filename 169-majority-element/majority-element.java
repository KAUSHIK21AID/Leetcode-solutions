class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer>h = new HashMap<>();

        for(int i:nums)
        {
            if(h.containsKey(i))
            {
                h.put(i,h.get(i)+1);
            }
            else
            {
                h.put(i,1);
            }
        }

        for(int i:h.keySet())
        {
            if(h.get(i)>nums.length/2)
            {
                return i;
            }
        }
        return -1;
    }
}