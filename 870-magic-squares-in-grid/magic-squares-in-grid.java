class Solution {
    public int numMagicSquaresInside(int[][] grid) 
    {
        int count=0;
        if(grid.length<3)
        {
            return 0;
        }
        else
        {
            for(int i=0;i<grid.length-2;i++)
            {
                for(int j=0;j<grid[i].length-2;j++)
                {
                    if(checkmagic(grid,i,j))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean checkmagic(int[][]grid, int r, int c)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=r;i<r+3;i++)
        {
            for(int j=c;j<c+3;j++)
            {
                if(!hs.isEmpty() && hs.contains(grid[i][j]))
                {
                    return false;
                }
                if(grid[i][j]>9 || grid[i][j]<1)
                {
                    return false;
                }

                hs.add(grid[i][j]);
            }
        }
        int r1=grid[r][c]+grid[r][c+1]+grid[r][c+2];
        int r2=grid[r+1][c]+grid[r+1][c+1]+grid[r+1][c+2];
        int r3=grid[r+2][c]+grid[r+2][c+1]+grid[r+2][c+2];
        int c1=grid[r][c]+grid[r+1][c]+grid[r+2][c];
        int c2=grid[r][c+1]+grid[r+1][c+1]+grid[r+2][c+1];
        int c3=grid[r][c+2]+grid[r+1][c+2]+grid[r+2][c+2];
        int d1=grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2];
        int d2=grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c];
        if(r1==r2 && r2==r3 && r3==c1 && c1==c2 && c2==c3 && c3==d1 && d1==d2){
            return true;
        }
        return false;

    }
}