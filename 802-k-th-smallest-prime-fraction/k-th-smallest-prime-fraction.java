class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int []>p = new PriorityQueue<>((x,y) -> Double.compare((double)y[0]/y[1], (double)x[0]/x[1]));
        int res[] = new int[2];
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j = arr.length-1;j>=0;j--)
            {
                p.add(new int[]{arr[i],arr[j]});

                if(p.size()>k)
                {
                    p.poll();
                }
            }
        }

        return p.poll();
    }
}