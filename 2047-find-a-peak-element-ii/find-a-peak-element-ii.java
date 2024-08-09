class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int ans[] = new int[2];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(max<mat[i][j])
                {
                    max = mat[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }

            }
        }

        return ans;
    }
}