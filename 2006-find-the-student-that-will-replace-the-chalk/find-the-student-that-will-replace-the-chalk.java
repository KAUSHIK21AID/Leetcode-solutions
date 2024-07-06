class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i=0;
        long sum = 0;

        for(int j=0;j<chalk.length;j++)
        {
            sum+=chalk[j];
        }
        long d = k/sum;
        k-=d*sum;
        while(k>=chalk[i])
        {
            k = k-chalk[i];
            i++;
            if(i>=chalk.length)
            {
                i = i%chalk.length;
            }
        }

        return i;
    }
}