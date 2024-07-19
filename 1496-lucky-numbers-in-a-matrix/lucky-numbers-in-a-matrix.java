class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>rows = new ArrayList<>();
        List<Integer>cols = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int mi = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++)
            {
                mi = Math.min(mi,matrix[i][j]);
            }
            rows.add(mi);
        }

        for(int i=0;i<matrix[0].length;i++)
        {
            int ma = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++)
            {
                ma = Math.max(ma, matrix[j][i]);
            }
            cols.add(ma);
        }

        for(int i:rows)
        {
            if(cols.contains(i))
            {
                ans.add(i);
            }
        }

        return ans;
    }
}