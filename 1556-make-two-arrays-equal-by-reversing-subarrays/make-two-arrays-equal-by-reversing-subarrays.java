class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // HashMap<Integer, Integer>hm = new HashMap<>();

        // for(int i:target)
        // {
        //     hm.put(i, hm.getOrDefault(i,0)+1);
        // }

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(target[i]!=arr[i])
            {
                return false;
            }
        }

        return true;

    }
}