class Solution {
    public int minSwapsCouples(int[] row) {
        int swaps = 0;
        for(int i=0;i<row.length;i=i+2)
        {
            int hubby = row[i];
            int wife = row[i]%2==0?row[i]+1:row[i]-1;

            if(row[i+1]!=wife)
            {
                for(int j=i+1;j<row.length;j++)
                {
                    if(row[j]==wife)
                    {
                        swaps++;
                        row[j] = row[i+1];
                        row[i+1] = wife;
                        break;
                    }
                }
            }
        }
        return swaps;
    }
}